package top.iserv.ylpay;

public class Config {
    private String signKey;

    public String getSignKey() {
        return signKey == null ? "" : signKey.trim();
    }

    public Config setSignKey(String signKey) {
        this.signKey = signKey;

        return this;
    }
}
