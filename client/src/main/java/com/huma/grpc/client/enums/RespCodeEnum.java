package com.huma.grpc.client.enums;

/**
 * @author hudenian
 * @date 2021/7/16
 */
public enum RespCodeEnum {
    /**
     * 成功
     */
    SUCCESS(10000, "请求成功!"),

    /**
     * 失败
     */
    FAIL(20000, "请求失败!");

    private final int code;
    private final String msg;

    RespCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static RespCodeEnum getByCode(int code) {
        for (RespCodeEnum e : values()) {
            if (e.getCode() == code) {
                return e;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
