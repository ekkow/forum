package com.example.arknightsdemo.enums;


public enum CodeEnum {
    SUCCESS(200, "成功"), ERROR(500, "失败");
    private Integer code;
    private String message;

    CodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
