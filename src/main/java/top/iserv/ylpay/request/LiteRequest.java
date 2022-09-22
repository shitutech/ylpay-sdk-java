package top.iserv.ylpay.request;

import top.iserv.ylpay.AbstractRequest;

public class LiteRequest extends AbstractRequest<LiteRequest> {
    // 翼龙商户号
    private String mchid;

    // 营业员登录Token
    private String token;

    // 订单金额（单位：元）
    private String totalFee;

    // 微信小程序APPID
    private String appid;

    // 上述微信小程序下的客户openid
    private String openid;

    // 外部商户订单号（建议上传）
    private String outMerchantOrderNo;

    // 是否为分账订单
    private String isNeedShare;

    // 支付后回调通知地址（请进行 urlencode 编码后参与签名计算）
    private String notify_url;

    public String getMchid() {
        return mchid;
    }

    public LiteRequest setMchid(String mchid) {
        this.mchid = mchid;
        return this;
    }

    public String getToken() {
        return token;
    }

    public LiteRequest setToken(String token) {
        this.token = token;
        return this;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public LiteRequest setTotalFee(String totalFee) {
        this.totalFee = totalFee;
        return this;
    }

    public String getAppid() {
        return appid;
    }

    public LiteRequest setAppid(String appid) {
        this.appid = appid;
        return this;
    }

    public String getOpenid() {
        return openid;
    }

    public LiteRequest setOpenid(String openid) {
        this.openid = openid;
        return this;
    }

    public String getOutMerchantOrderNo() {
        return outMerchantOrderNo;
    }

    public LiteRequest setOutMerchantOrderNo(String outMerchantOrderNo) {
        this.outMerchantOrderNo = outMerchantOrderNo;
        return this;
    }

    public String getIsNeedShare() {
        return isNeedShare;
    }

    public LiteRequest setIsNeedShare(String isNeedShare) {
        this.isNeedShare = isNeedShare;
        return this;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public LiteRequest setNotify_url(String notify_url) {
        this.notify_url = notify_url;

        return this;
    }
}
