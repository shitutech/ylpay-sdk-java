package top.iserv.ylpay.response;

import top.iserv.ylpay.AbstractResponse;

public class ScancodeResponse extends AbstractResponse {
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

    // 支付方式
    private String payType;

    // 订单创建时间
    private String createTime;

    // 二维码链接（通过二维码生成工具自行生成二维码）
    private String qrCode;

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

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    @Override
    public String toString() {
        return "ScancodeResponse{" +
                "thirdCode='" + thirdCode + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", storeName='" + storeName + '\'' +
                ", clerk='" + clerk + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", totalFee='" + totalFee + '\'' +
                ", receiptFee='" + receiptFee + '\'' +
                ", payType='" + payType + '\'' +
                ", createTime='" + createTime + '\'' +
                ", qrCode='" + qrCode + '\'' +
                ", status='" + status + '\'' +
                ", errCodeNum='" + errCodeNum + '\'' +
                ", errCode='" + errCode + '\'' +
                ", errMsg='" + errMsg + '\'' +
                ", data=" + data +
                '}';
    }
}
