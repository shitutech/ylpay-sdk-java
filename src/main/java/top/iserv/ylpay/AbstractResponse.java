package top.iserv.ylpay;

public abstract class AbstractResponse {
    // 响应状态 SUCCESS 为成功，否则为失败
    protected String status;

    // 错误代码对应的数字代码
    protected String errCodeNum;

    // 错误代码
    protected String errCode;

    // 错误消息
    protected String errMsg;

    // 必要时会返回该字段，一般不返回
    protected Object data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrCodeNum() {
        return errCodeNum;
    }

    public void setErrCodeNum(String errCodeNum) {
        this.errCodeNum = errCodeNum;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
