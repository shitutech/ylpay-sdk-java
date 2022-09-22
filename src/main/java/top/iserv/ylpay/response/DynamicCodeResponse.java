package top.iserv.ylpay.response;

import top.iserv.ylpay.AbstractResponse;

public class DynamicCodeResponse extends AbstractResponse {
    // 第三方业务码
    private String thirdCode;

    // 翼龙商户号
    private String mchid;

    // 翼龙商户名称
    private String merchantName;

    // 门店Code
    private String storeCode;

    // 所属门店（分店）名称
    private String storeName;

    // 翼龙订单号
    private String orderNo;

    // 商户订单号
    private String outMerchantOrderNo;

    // 订单金额（单位：元）
    private String totalFee;

    // 支付宝打折金额
    private String alipayDiscount;

    // 微信打折金额
    private String wxpayDiscount;

    // 交易金额
    private String receiptFee;

    // 订单状态码
    private String statusCode;

    // 订单状态码描述
    private String orderStatus;

    // 支付方式
    private String payType;

    // 支付时间
    private String payTime;

    // 订单创建时间
    private String createTime;

    // 上游交易流水号
    private String tradeNo;

    // 支付宝动码跳转支付链接
    private String cloudPayInfo;

    public String getThirdCode() {
        return thirdCode;
    }

    public void setThirdCode(String thirdCode) {
        this.thirdCode = thirdCode;
    }

    public String getMchid() {
        return mchid;
    }

    public void setMchid(String mchid) {
        this.mchid = mchid;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOutMerchantOrderNo() {
        return outMerchantOrderNo;
    }

    public void setOutMerchantOrderNo(String outMerchantOrderNo) {
        this.outMerchantOrderNo = outMerchantOrderNo;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getAlipayDiscount() {
        return alipayDiscount;
    }

    public void setAlipayDiscount(String alipayDiscount) {
        this.alipayDiscount = alipayDiscount;
    }

    public String getWxpayDiscount() {
        return wxpayDiscount;
    }

    public void setWxpayDiscount(String wxpayDiscount) {
        this.wxpayDiscount = wxpayDiscount;
    }

    public String getReceiptFee() {
        return receiptFee;
    }

    public void setReceiptFee(String receiptFee) {
        this.receiptFee = receiptFee;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getCloudPayInfo() {
        return cloudPayInfo;
    }

    public void setCloudPayInfo(String cloudPayInfo) {
        this.cloudPayInfo = cloudPayInfo;
    }

    @Override
    public String toString() {
        return "DynamicCodeResponse{" +
                "thirdCode='" + thirdCode + '\'' +
                ", mchid='" + mchid + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", storeCode='" + storeCode + '\'' +
                ", storeName='" + storeName + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", outMerchantOrderNo='" + outMerchantOrderNo + '\'' +
                ", totalFee='" + totalFee + '\'' +
                ", alipayDiscount='" + alipayDiscount + '\'' +
                ", wxpayDiscount='" + wxpayDiscount + '\'' +
                ", receiptFee='" + receiptFee + '\'' +
                ", statusCode='" + statusCode + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", payType='" + payType + '\'' +
                ", payTime='" + payTime + '\'' +
                ", createTime='" + createTime + '\'' +
                ", tradeNo='" + tradeNo + '\'' +
                ", cloudPayInfo='" + cloudPayInfo + '\'' +
                ", status='" + status + '\'' +
                ", errCodeNum='" + errCodeNum + '\'' +
                ", errCode='" + errCode + '\'' +
                ", errMsg='" + errMsg + '\'' +
                ", data=" + data +
                '}';
    }
}
