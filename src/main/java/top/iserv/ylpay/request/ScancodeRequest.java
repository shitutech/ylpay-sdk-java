package top.iserv.ylpay.request;

import top.iserv.ylpay.AbstractRequest;

public class ScancodeRequest extends AbstractRequest<ScancodeRequest> {
    // 翼龙商户号
    private String mchid;

    // 营业员登录Token
    private String token;

    // 订单金额（单位：元）
    private String totalFee;

    // 外部商户订单号（建议上传）
    private String outMerchantOrderNo;

    // 是否为分账订单
    private String isNeedShare;

    // 支付后回调通知地址（请进行 urlencode 编码后参与签名计算）
    private String notify_url;

    public String getMchid() {
        return mchid;
    }

    public ScancodeRequest setMchid(String mchid) {
        this.mchid = mchid;

        return this;
    }

    public String getToken() {
        return token;
    }

    public ScancodeRequest setToken(String token) {
        this.token = token;

        return this;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public ScancodeRequest setTotalFee(String totalFee) {
        this.totalFee = totalFee;

        return this;
    }

    public String getOutMerchantOrderNo() {
        return outMerchantOrderNo;
    }

    public ScancodeRequest setOutMerchantOrderNo(String outMerchantOrderNo) {
        this.outMerchantOrderNo = outMerchantOrderNo;

        return this;
    }

    public String getIsNeedShare() {
        return isNeedShare;
    }

    public ScancodeRequest setIsNeedShare(String isNeedShare) {
        this.isNeedShare = isNeedShare;

        return this;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public ScancodeRequest setNotify_url(String notify_url) {
        this.notify_url = notify_url;

        return this;
    }
}
