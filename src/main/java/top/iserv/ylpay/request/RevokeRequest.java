package top.iserv.ylpay.request;

import top.iserv.ylpay.AbstractRequest;

public class RevokeRequest extends AbstractRequest<RevokeRequest> {
    // 翼龙商户号
    private String mchid;

    // 营业员登录Token
    private String token;

    // 翼龙订单号
    private String orderNo;

    public String getMchid() {
        return mchid;
    }

    public RevokeRequest setMchid(String mchid) {
        this.mchid = mchid;
        return this;
    }

    public String getToken() {
        return token;
    }

    public RevokeRequest setToken(String token) {
        this.token = token;
        return this;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public RevokeRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
}
