package top.iserv.ylpay.models;

import com.alibaba.fastjson2.annotation.JSONField;

import java.io.Serializable;

public class MerchantCloudPayInfo implements Serializable {
    private static final long serialVersionUID = -5377581734437000075L;

    // 时间戳（微信）
    private String timeStamp;

    // 订单详情扩展字符串（微信）
    @JSONField(name = "package")
    private String packageStr;

    // 签名（微信）
    private String paySign;

    // 商户申请的公众号对应的appid（微信）
    private String appId;

    // 签名方式（微信）
    private String signType;

    // 随机字符串（微信）
    private String nonceStr;

    // 该交易在支付宝系统中的交易流水号
    private String tradeNO;

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getPackageStr() {
        return packageStr;
    }

    public void setPackageStr(String packageStr) {
        this.packageStr = packageStr;
    }

    public String getPaySign() {
        return paySign;
    }

    public void setPaySign(String paySign) {
        this.paySign = paySign;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getTradeNO() {
        return tradeNO;
    }

    public void setTradeNO(String tradeNO) {
        this.tradeNO = tradeNO;
    }

    @Override
    public String toString() {
        return "MerchantCloudPayInfo{" +
                "timeStamp='" + timeStamp + '\'' +
                ", packageStr='" + packageStr + '\'' +
                ", paySign='" + paySign + '\'' +
                ", appId='" + appId + '\'' +
                ", signType='" + signType + '\'' +
                ", nonceStr='" + nonceStr + '\'' +
                ", tradeNO='" + tradeNO + '\'' +
                '}';
    }
}
