package top.iserv.ylpay.request;

import top.iserv.ylpay.AbstractRequest;

public class RefundRequest extends AbstractRequest<RefundRequest> {
    // 翼龙商户号
    private String mchid;

    // 营业员登录Token
    private String token;

    // 翼龙订单号
    private String orderNo;

    // 待退款金额（单位：元）
    private String money;

    // 退款密码（仅商户开启免密退款时可选)
    private String adminPwd;

    public String getMchid() {
        return mchid;
    }

    public RefundRequest setMchid(String mchid) {
        this.mchid = mchid;
        return this;
    }

    public String getToken() {
        return token;
    }

    public RefundRequest setToken(String token) {
        this.token = token;
        return this;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public RefundRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }

    public String getMoney() {
        return money;
    }

    public RefundRequest setMoney(String money) {
        this.money = money;
        return this;
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public RefundRequest setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
        return this;
    }
}
