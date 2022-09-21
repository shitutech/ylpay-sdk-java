package top.iserv.ylpay.response;

import top.iserv.ylpay.AbstractResponse;

public class LoginResponse extends AbstractResponse {
    // 营业员登录 Token（默认每次登录都会改变）
    private String token;

    // 所属门店ID
    private Integer storeId;

    // 翼龙商户名称
    private String merchantName;

    // 所属门店（分店）名称
    private String storeName;

    // 所属门店编号
    private String storeNumber;

    // 所属门店Code（Since v2022.09.01.0）
    private String storeCode;

    // 营业员名称
    private String operatorName;

    // 营业员编号
    private String number;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
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

    public String getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(String storeNumber) {
        this.storeNumber = storeNumber;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "token='" + token + '\'' +
                ", storeId=" + storeId +
                ", merchantName='" + merchantName + '\'' +
                ", storeName='" + storeName + '\'' +
                ", storeNumber='" + storeNumber + '\'' +
                ", storeCode='" + storeCode + '\'' +
                ", operatorName='" + operatorName + '\'' +
                ", number='" + number + '\'' +
                ", status='" + status + '\'' +
                ", errCodeNum='" + errCodeNum + '\'' +
                ", errCode='" + errCode + '\'' +
                ", errMsg='" + errMsg + '\'' +
                ", data=" + data +
                '}';
    }
}
