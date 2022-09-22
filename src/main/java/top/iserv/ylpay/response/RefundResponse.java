package top.iserv.ylpay.response;

import top.iserv.ylpay.AbstractResponse;

public class RefundResponse extends AbstractResponse {
    // 第三方业务码
    private String thirdCode;

    // 翼龙商户名称
    private String merchantName;

    // 所属门店（分店）名称
    private String storeName;

    // 营业员编号
    private String clerk;

    // 翼龙订单号
    private String orderNo;

    // 订单金额（单位：元）
    private String totalFee;

    // 交易金额
    private String receiptFee;

    // 退款金额
    private String refundFee;

    // 支付方式
    private String payType;

    // 最近一次退款时间（成功或进行中的）
    private String refundTime;

    // 上游交易流水号
    private String tradeNo;

    // 订单状态
    private String orderStatus;

    // 付款支付宝账号
    private String userAlipayAccount;

    // 退款订单号
    private String refundOrderNo;

    public String getThirdCode() {
        return thirdCode;
    }

    public void setThirdCode(String thirdCode) {
        this.thirdCode = thirdCode;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getClerk() {
        return clerk;
    }

    public void setClerk(String clerk) {
        this.clerk = clerk;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getReceiptFee() {
        return receiptFee;
    }

    public void setReceiptFee(String receiptFee) {
        this.receiptFee = receiptFee;
    }

    public String getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(String refundFee) {
        this.refundFee = refundFee;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(String refundTime) {
        this.refundTime = refundTime;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getUserAlipayAccount() {
        return userAlipayAccount;
    }

    public void setUserAlipayAccount(String userAlipayAccount) {
        this.userAlipayAccount = userAlipayAccount;
    }

    public String getRefundOrderNo() {
        return refundOrderNo;
    }

    public void setRefundOrderNo(String refundOrderNo) {
        this.refundOrderNo = refundOrderNo;
    }

    @Override
    public String toString() {
        return "RefundResponse{" +
                "thirdCode='" + thirdCode + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", storeName='" + storeName + '\'' +
                ", clerk='" + clerk + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", totalFee='" + totalFee + '\'' +
                ", receiptFee='" + receiptFee + '\'' +
                ", refundFee='" + refundFee + '\'' +
                ", payType='" + payType + '\'' +
                ", refundTime='" + refundTime + '\'' +
                ", tradeNo='" + tradeNo + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", userAlipayAccount='" + userAlipayAccount + '\'' +
                ", refundOrderNo='" + refundOrderNo + '\'' +
                ", status='" + status + '\'' +
                ", errCodeNum='" + errCodeNum + '\'' +
                ", errCode='" + errCode + '\'' +
                ", errMsg='" + errMsg + '\'' +
                ", data=" + data +
                '}';
    }
}
