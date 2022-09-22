package top.iserv.ylpay.request;

import top.iserv.ylpay.AbstractRequest;

public class OrderPollingRequest extends AbstractRequest<OrderPollingRequest> {
    // 翼龙商户号
    private String mchid;

    // 营业员登录Token
    private String token;

    // 翼龙订单号
    private String orderNo;

    public String getMchid() {
        return mchid;
    }

    public OrderPollingRequest setMchid(String mchid) {
        this.mchid = mchid;
        return this;
    }

    public String getToken() {
        return token;
    }

    public OrderPollingRequest setToken(String token) {
        this.token = token;
        return this;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public OrderPollingRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
}
