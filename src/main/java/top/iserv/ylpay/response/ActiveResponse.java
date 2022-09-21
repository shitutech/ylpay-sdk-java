package top.iserv.ylpay.response;

import top.iserv.ylpay.AbstractResponse;

public class ActiveResponse extends AbstractResponse {
    // 翼龙商户号
    private String mchid;

    // 加签密钥
    private String key;

    // 固定为 new
    private String sys;

    // 商户简称
    private String merchant_short_name;

    public String getMchid() {
        return mchid;
    }

    public void setMchid(String mchid) {
        this.mchid = mchid;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSys() {
        return sys;
    }

    public void setSys(String sys) {
        this.sys = sys;
    }

    public String getMerchant_short_name() {
        return merchant_short_name;
    }

    public void setMerchant_short_name(String merchant_short_name) {
        this.merchant_short_name = merchant_short_name;
    }

    @Override
    public String toString() {
        return "ActiveResponse{" +
                "mchid='" + mchid + '\'' +
                ", key='" + key + '\'' +
                ", sys='" + sys + '\'' +
                ", merchant_short_name='" + merchant_short_name + '\'' +
                ", status='" + status + '\'' +
                ", errCodeNum='" + errCodeNum + '\'' +
                ", errCode='" + errCode + '\'' +
                ", errMsg='" + errMsg + '\'' +
                ", data=" + data +
                '}';
    }
}
