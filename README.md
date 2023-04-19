# 介绍

 翼龙支付 API JAVA SDK
 
# 调用

```java
import top.iserv.ylpay.Config;
import top.iserv.ylpay.client.PayClient;
import top.iserv.ylpay.request.BarcodeRequest;
import top.iserv.ylpay.response.BarCodeResponse;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Config config1 = new Config();
        config1.setSignKey("*******");

        final String mchId = "1******";
        final String token = "**********";
        final String storeCode = "s*******";

        PayClient payClient = new PayClient(config1);

        条码支付
        BarcodeRequest barcodeRequest = new BarcodeRequest();
        barcodeRequest.setMchid(mchId).setToken(token)
                .setTotalFee("0.01").setUserCode("********");
        BarCodeResponse barCodeResponse = payClient.barcodePay(barcodeRequest);
        System.out.println(barCodeResponse);
    }
}
```

# 接口

| API       | 请求类                 | 响应类                  |
|-----------|---------------------|----------------------|
| 营业员登录     | LoginRequest        | LoginResponse        |
| B扫C支付     | BarcodeRequest      | BarCodeResponse      |
| C扫B支付     | ScancodeRequest     | ScancodeResponse     |
| 商户自主C扫B支付 | MerchantScanRequest | MerchantScanResponse |
| 微信小程序支付   | LiteRequest         | LiteResponse         |
| 支付宝动码     | DynamicCodeRequest  | DynamicCodeResponse  |
| 订单轮询      | OrderPollingRequest | OrderPollingResponse |
| 订单退款      | RefundRequest       | RefundResponse       |
| 订单撤销      | RevokeRequest       | RevokeResponse       |
