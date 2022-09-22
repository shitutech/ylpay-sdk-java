package top.iserv.ylpay.request;

import top.iserv.ylpay.AbstractRequest;

public class BarcodeRequest extends AbstractRequest<BarcodeRequest> {
    // 翼龙商户号
    private String mchid;

    // 营业员登录Token
    private String token;

    // 支付条码
    private String userCode;

    // 订单金额（单位：元）
    private String totalFee;

    // 外部商户订单号（建议上传）
    private String outMerchantOrderNo;

    // 是否为分账订单
    private String isNeedShare;

    public String getMchid() {
        return mchid;
    }

    public BarcodeRequest setMchid(String mchid) {
        this.mchid = mchid;

        return this;
    }

    public String getToken() {
        return token;
    }

    public BarcodeRequest setToken(String token) {
        this.token = token;

        return this;
    }

    public String getUserCode() {
        return userCode;
    }

    public BarcodeRequest setUserCode(String userCode) {
        this.userCode = userCode;

        return this;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public BarcodeRequest setTotalFee(String totalFee) {
        this.totalFee = totalFee;

        return this;
    }

    public String getOutMerchantOrderNo() {
        return outMerchantOrderNo;
    }

    public BarcodeRequest setOutMerchantOrderNo(String outMerchantOrderNo) {
        this.outMerchantOrderNo = outMerchantOrderNo;

        return this;
    }

    public String getIsNeedShare() {
        return isNeedShare;
    }

    public BarcodeRequest setIsNeedShare(String isNeedShare) {
        this.isNeedShare = isNeedShare;

        return this;
    }
}
