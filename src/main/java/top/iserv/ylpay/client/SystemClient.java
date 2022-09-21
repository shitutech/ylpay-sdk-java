package top.iserv.ylpay.client;

import com.alibaba.fastjson2.JSON;
import org.jetbrains.annotations.NotNull;
import top.iserv.ylpay.AbstractClient;
import top.iserv.ylpay.Config;
import top.iserv.ylpay.request.ActiveRequest;
import top.iserv.ylpay.response.ActiveResponse;

public class SystemClient extends AbstractClient {
    public SystemClient(Config config) {
        super(config);
    }

    public ActiveResponse active(@NotNull ActiveRequest request) throws IllegalAccessException {
        String respData = sendRequest(request.getParams(), "/merchant/system/active", false);

        ActiveResponse response = JSON.parseObject(respData, ActiveResponse.class);

        return response;
    }
}
