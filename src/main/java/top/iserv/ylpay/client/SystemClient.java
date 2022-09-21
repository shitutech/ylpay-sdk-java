package top.iserv.ylpay.client;

import com.alibaba.fastjson2.JSON;
import org.jetbrains.annotations.NotNull;
import top.iserv.ylpay.AbstractClient;
import top.iserv.ylpay.Config;
import top.iserv.ylpay.request.ActiveRequest;
import top.iserv.ylpay.request.LoginRequest;
import top.iserv.ylpay.response.ActiveResponse;
import top.iserv.ylpay.response.LoginResponse;

import java.util.Objects;

public class SystemClient extends AbstractClient {
    public SystemClient(Config config) {
        super(config);
    }

    public ActiveResponse active(@NotNull ActiveRequest request) throws IllegalAccessException {
        String respData = sendRequest(request.getParams(), "/merchant/system/active", false);

        ActiveResponse response = JSON.parseObject(respData, ActiveResponse.class);

        if (Objects.equals(response.getStatus(), "FAIL")) {
            throw new RuntimeException(response.getErrMsg());
        }

        return response;
    }

    public LoginResponse login(LoginRequest request) throws IllegalAccessException {
        String respData = sendRequest(request.getParams(), "/merchant/clerk/login", true);

        LoginResponse response = JSON.parseObject(respData, LoginResponse.class);

        if (Objects.equals(response.getStatus(), "FAIL")) {
            throw new RuntimeException(response.getErrMsg());
        }

        return response;
    }
}
