package top.iserv.ylpay;

import java.lang.reflect.Field;
import java.util.HashMap;

public abstract class AbstractRequest<T extends AbstractRequest<T>> {
    // 设备厂商的 SN 号
    protected String sn;

    // 基站信息或收银终端公网IP
    protected String bi;

    // 经度，收银终端具备GPS芯片或可获取到经纬度信息时需要上传
    protected String longitude;

    // 纬度，收银终端具备GPS芯片或可获取到经纬度信息时需要上传
    protected String latitude;

    public T setSn(String sn) {
        if (null != sn) {
            this.sn = sn.trim();
        }

        return (T) this;
    }

    public T setBi(String bi) {
        if (null != bi) {
            this.bi = bi.trim();
        }

        return (T) this;
    }

    public T setLongitude(String longitude) {
        if (null != longitude) {
            this.longitude = longitude.trim();
        }

        return (T) this;
    }

    public T setLatitude(String latitude) {
        if (null != latitude) {
            this.latitude = latitude.trim();
        }

        return (T) this;
    }

    public HashMap<String, Object> getParams() throws IllegalAccessException {
        HashMap<String, Object> map = new HashMap<>();

        if (this.getClass().getSuperclass() != null) {
            for (Field field : this.getClass().getSuperclass().getDeclaredFields()) {
                field.setAccessible(true);
                map.put(field.getName(), field.get(this));
            }
        }

        for (Field field : this.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            map.put(field.getName(), field.get(this));
        }

        return map;
    }
}
