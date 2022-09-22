package top.iserv.ylpay.request;

import top.iserv.ylpay.AbstractRequest;

public class DynamicCodeRequest extends AbstractRequest<DynamicCodeRequest> {
    // 翼龙商户号
    private String mchid;

    // 门店code（大写S开头）
    private String storeCode;

    // 订单金额（单位：元）
    private String totalFee;

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

    public DynamicCodeRequest setMchid(String mchid) {
        this.mchid = mchid;
        return this;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public DynamicCodeRequest setStoreCode(String storeCode) {
        this.storeCode = storeCode;
        return this;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public DynamicCodeRequest setTotalFee(String totalFee) {
        this.totalFee = totalFee;
        return this;
    }

    public String getOutMerchantOrderNo() {
        return outMerchantOrderNo;
    }

    public DynamicCodeRequest setOutMerchantOrderNo(String outMerchantOrderNo) {
        this.outMerchantOrderNo = outMerchantOrderNo;
        return this;
    }

    public String getIsNeedShare() {
        return isNeedShare;
    }

    public DynamicCodeRequest setIsNeedShare(String isNeedShare) {
        this.isNeedShare = isNeedShare;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public DynamicCodeRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public DynamicCodeRequest setNotify_url(String notify_url) {
        this.notify_url = notify_url;
        return this;
    }
}
