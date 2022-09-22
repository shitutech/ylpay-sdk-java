package top.iserv.ylpay.request;

import top.iserv.ylpay.AbstractRequest;

public class MerchantScanRequest extends AbstractRequest<MerchantScanRequest> {
    // 翼龙商户号
    private String mchid;

    // 门店code（大写S开头）
    private String storeCode;

    // 订单金额（单位：元）
    private String totalFee;

    // 微信公众号或支付宝APPID
    private String appid;

    // 对应APPID下的用户openid（微信）或userid（支付宝）
    private String openid;

    // 支付渠道（1 微信 2 支付宝 3 云闪付【暂未支持】）
    private String payChannel;

    // 外部商户订单号（建议上传）
    private String outMerchantOrderNo;

    // 是否为分账订单
    private String isNeedShare;

    // 备注
    private String remark;

    // 支付后回调通知地址（请进行 urlencode 编码后参与签名计算）
    private String notify_url;

    public String getMchid() {
        return mchid;
    }

    public MerchantScanRequest setMchid(String mchid) {
        this.mchid = mchid;

        return this;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public MerchantScanRequest setStoreCode(String storeCode) {
        this.storeCode = storeCode;

        return this;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public MerchantScanRequest setTotalFee(String totalFee) {
        this.totalFee = totalFee;

        return this;
    }

    public String getAppid() {
        return appid;
    }

    public MerchantScanRequest setAppid(String appid) {
        this.appid = appid;

        return this;
    }

    public String getOpenid() {
        return openid;
    }

    public MerchantScanRequest setOpenid(String openid) {
        this.openid = openid;

        return this;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public MerchantScanRequest setPayChannel(String payChannel) {
        this.payChannel = payChannel;

        return this;
    }

    public String getOutMerchantOrderNo() {
        return outMerchantOrderNo;
    }

    public MerchantScanRequest setOutMerchantOrderNo(String outMerchantOrderNo) {
        this.outMerchantOrderNo = outMerchantOrderNo;

        return this;
    }

    public String getIsNeedShare() {
        return isNeedShare;
    }

    public MerchantScanRequest setIsNeedShare(String isNeedShare) {
        this.isNeedShare = isNeedShare;

        return this;
    }

    public String getRemark() {
        return remark;
    }

    public MerchantScanRequest setRemark(String remark) {
        this.remark = remark;

        return this;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public MerchantScanRequest setNotify_url(String notify_url) {
        this.notify_url = notify_url;

        return this;
    }
}
