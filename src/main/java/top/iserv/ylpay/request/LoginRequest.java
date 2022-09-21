package top.iserv.ylpay.request;

import top.iserv.ylpay.AbstractRequest;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class LoginRequest extends AbstractRequest<LoginRequest> {
    // 翼龙商户号
    private String mchid;

    // 营业员登录账号
    private String account;

    // 按照 md5(md5(pwd)连接上pwd) 获得的32为小写MD5串
    private String pwd;

    // 是否更新用户token（更新后旧 token 将立即失效）；更新值为小写 true，否则不更新
    private String refreshToken;

    public String getMchid() {
        return mchid;
    }

    public LoginRequest setMchid(String mchid) {
        this.mchid = mchid;

        return this;
    }

    public String getAccount() {
        return account;
    }

    public LoginRequest setAccount(String account) {
        this.account = account;

        return this;
    }

    public String getPwd() {
        return pwd;
    }

    public LoginRequest setPwd(String pwd) {
        if (pwd != null) {
            pwd = pwd.trim();

            this.pwd = encryptMD5(encryptMD5(pwd) + pwd);
        }

        return this;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public LoginRequest setRefreshToken(boolean refreshToken) {
        this.refreshToken = refreshToken ? "true" : "false";

        return this;
    }

    protected String encryptMD5(String str) {
        String hexStr = "";

        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digest = md5.digest(str.getBytes(StandardCharsets.UTF_8));

            StringBuilder hash = new StringBuilder();
            for (byte aByte : digest) {
                String hex = Integer.toHexString(0xFF & aByte);
                if (hex.length() == 1) {
                    hash.append('0');
                }
                hash.append(hex);
            }

            return hash.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
