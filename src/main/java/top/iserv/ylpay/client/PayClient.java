package top.iserv.ylpay.client;

import com.alibaba.fastjson2.JSON;
import top.iserv.ylpay.AbstractClient;
import top.iserv.ylpay.Config;
import top.iserv.ylpay.request.*;
import top.iserv.ylpay.response.*;

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

    public LiteResponse litePay(LiteRequest request) throws IllegalAccessException {
        String respData = sendRequest(request.getParams(), "/merchant/pay/mini_program_pay", true);

        LiteResponse response = JSON.parseObject(respData, LiteResponse.class);

        if (Objects.equals(response.getStatus(), "FAIL")) {
            throw new RuntimeException(response.getErrMsg());
        }

        return response;
    }

    public DynamicCodeResponse dynamicCodePay(DynamicCodeRequest request) throws IllegalAccessException {
        String respData = sendRequest(request.getParams(), "/merchant/pay/qr_pay", true);

        DynamicCodeResponse response = JSON.parseObject(respData, DynamicCodeResponse.class);

        if (Objects.equals(response.getStatus(), "FAIL")) {
            throw new RuntimeException(response.getErrMsg());
        }

        return response;
    }

    public OrderPollingResponse orderPolling(OrderPollingRequest request) throws IllegalAccessException {
        String respData = sendRequest(request.getParams(), "/merchant/pay/query_order", true);

        OrderPollingResponse response = JSON.parseObject(respData, OrderPollingResponse.class);

        if (Objects.equals(response.getStatus(), "FAIL")) {
            throw new RuntimeException(response.getErrMsg());
        }

        return response;
    }

    public RefundResponse refund(RefundRequest request) throws IllegalAccessException {
        String respData = sendRequest(request.getParams(), "/merchant/refund/refund", true);

        RefundResponse response = JSON.parseObject(respData, RefundResponse.class);

        if (Objects.equals(response.getStatus(), "FAIL")) {
            throw new RuntimeException(response.getErrMsg());
        }

        return response;
    }

    public RevokeResponse revoke(RevokeRequest request) throws IllegalAccessException {
        String respData = sendRequest(request.getParams(), "/merchant/refund/cancel", true);

        RevokeResponse response = JSON.parseObject(respData, RevokeResponse.class);

        if (Objects.equals(response.getStatus(), "FAIL")) {
            throw new RuntimeException(response.getErrMsg());
        }

        return response;
    }
}
