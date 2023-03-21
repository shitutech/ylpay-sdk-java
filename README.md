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