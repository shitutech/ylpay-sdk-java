package top.iserv.ylpay.request;

import top.iserv.ylpay.AbstractRequest;

public class ActiveRequest extends AbstractRequest<ActiveRequest> {
    // 激活码
    private String code;

    public String getCode() {
        return code;
    }

    public ActiveRequest setCode(String code) {
        if (null == code || code.trim().length() < 1) {
            throw new RuntimeException("激活码不能为空");
        }

        this.code = code.trim();

        return this;
    }
}
