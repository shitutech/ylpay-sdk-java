package top.iserv.ylpay;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class AbstractClient {
    private Config config;

    public AbstractClient(Config config) {
        this.config = config;
    }

    public String sendRequest(HashMap<String, Object> reqMap, String apiPath, boolean useSign) {
        // 置入请求时的公共参数中固定或者可以自行生成的参数
        // api_version 接口版本号，当前默认为：1.0
        reqMap.put("api_version", "1.0");
        // 渠道
        reqMap.put("channel", "YLSDK");
        // 随机字符串，由26个大小写字母和0-9 十个数字组成的 不定长唯一字符串
        reqMap.put("nonceStr", randomString(32));
        // 请求时间，从 Unix 纪元（格林威治时间 1970 年 1 月 1 日 00:00:00）到当前时间的秒数
        reqMap.put("timestamp", Integer.toString((int) (System.currentTimeMillis() / 1000)));
        // 签名类型（务必大写），支持 MD5、HMAC-SHA256；默认 为 MD5
        reqMap.put("signType", "HMAC-SHA256");
        if (useSign) {
            // 签名
            reqMap.put("sign", calculateSign(reqMap));
        }

        // 发起请求
        try {
            String domain = "https://guanj.51wanquan.com";
            URL url = new URL(domain + apiPath);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            connection.setConnectTimeout(3000);

            // 设置 header
            connection.setRequestProperty("Charset", "utf-8");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("User-Agent", "YLSDK/v1.0.0");

            connection.connect();

            StringBuilder encodeUrl = new StringBuilder();
            for (Map.Entry<String, Object> entry : reqMap.entrySet()) {
                if (entry.getValue() == null) {
                    continue;
                }

                String entryValue = entry.getValue().toString().trim();
                if (entryValue.length() < 1) {
                    continue;
                }

                encodeUrl.append(entry.getKey()).append("=")
                        .append(URLEncoder.encode(entryValue, "UTF-8")).append("&");
            }

            encodeUrl.deleteCharAt(encodeUrl.lastIndexOf("&"));

            final BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()));
            bufferedWriter.write(encodeUrl.toString());
            bufferedWriter.flush();
            bufferedWriter.close();

            StringBuilder responseStr = new StringBuilder();
            // read response
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    responseStr.append(line);
                }
            } finally {
                connection.disconnect();
            }

            String resp = responseStr.toString().trim();
            if (resp.length() < 1) {
                throw new RuntimeException("接口请求响应数据为空");
            }

            return resp;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected String calculateSign(HashMap<String, Object> map) {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);

        for (String key : keyList) {
            Object keyValue = map.get(key);

            if (keyValue == null) {
                continue;
            }

            if (keyValue.toString().trim().length() < 1) {
                continue;
            }

            stringBuilder.append(key).append("=").append(keyValue).append("&");
        }

        stringBuilder.append("key=").append(config.getSignKey());

        String sign = hmacDigest(stringBuilder.toString(), config.getSignKey(), "HmacSHA256");

        return sign == null ? "" : sign.toUpperCase();
    }

    /**
     * Generating HMAC MD5/SHA1/SHA256 etc
     */
    protected String hmacDigest(String msg, String keyString, String algo) {
        String digest = null;
        try {
            SecretKeySpec key = new SecretKeySpec((keyString).getBytes(StandardCharsets.UTF_8), algo);
            Mac mac = Mac.getInstance(algo);
            mac.init(key);

            byte[] bytes = mac.doFinal(msg.getBytes(StandardCharsets.US_ASCII));

            StringBuilder hash = new StringBuilder();
            for (byte aByte : bytes) {
                String hex = Integer.toHexString(0xFF & aByte);
                if (hex.length() == 1) {
                    hash.append('0');
                }
                hash.append(hex);
            }
            digest = hash.toString();
        } catch (InvalidKeyException | NoSuchAlgorithmException ignored) {
        }

        return digest;
    }

    protected String randomString(int strLength) {
        Random rnd = ThreadLocalRandom.current();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < strLength; i++) {
            boolean isChar = (rnd.nextInt(2) % 2 == 0);// 输出字母还是数字
            if (isChar) { // 字符串
                int choice = rnd.nextInt(2) % 2 == 0 ? 65 : 97; // 取得大写字母还是小写字母
                ret.append((char) (choice + rnd.nextInt(26)));
            } else { // 数字
                ret.append(Integer.toString(rnd.nextInt(10)));
            }
        }
        return ret.toString();
    }
}
