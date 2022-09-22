package top.iserv.ylpay.client;

import com.alibaba.fastjson2.JSON;
import top.iserv.ylpay.AbstractClient;
import top.iserv.ylpay.Config;
import top.iserv.ylpay.request.BarcodeRequest;
import top.iserv.ylpay.request.MerchantScanRequest;
import top.iserv.ylpay.request.ScancodeRequest;
import top.iserv.ylpay.response.BarCodeResponse;
import top.iserv.ylpay.response.MerchantScanResponse;
import top.iserv.ylpay.response.ScancodeResponse;

import java.util.Objects;

public class PayClient extends AbstractClient {
    public PayClient(Config config) {
        super(config);
    }

    public BarCodeResponse barcodePay(BarcodeRequest request) throws IllegalAccessException {
        String respData = sendRequest(request.getParams(), "/merchant/pay/barcode_pay", true);

        BarCodeResponse response = JSON.parseObject(respData, BarCodeResponse.class);

        if (Objects.equals(response.getStatus(), "FAIL")) {
            throw new RuntimeException(response.getErrMsg());
        }

        return response;
    }

    public ScancodeResponse scancodePay(ScancodeRequest request) throws IllegalAccessException {
        String respData = sendRequest(request.getParams(), "/merchant/pay/qrcode_pay", true);

        ScancodeResponse response = JSON.parseObject(respData, ScancodeResponse.class);

        if (Objects.equals(response.getStatus(), "FAIL")) {
            throw new RuntimeException(response.getErrMsg());
        }

        return response;
    }

    public MerchantScanResponse merchantScanPay(MerchantScanRequest request) throws IllegalAccessException {
        String respData = sendRequest(request.getParams(), "/merchant/pay/merchant_wap_pay", true);

        MerchantScanResponse response = JSON.parseObject(respData, MerchantScanResponse.class);

        if (Objects.equals(response.getStatus(), "FAIL")) {
            throw new RuntimeException(response.getErrMsg());
        }

        return response;
    }
}
