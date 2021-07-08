package com.example.arknightsdemo.util;

import com.example.arknightsdemo.enums.CodeEnum;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.BindingResult;


public class Result<T> {
    @ApiModelProperty("自定义code")
    private Integer code;
    @ApiModelProperty("返回信息")
    private String message;
    @ApiModelProperty("返回data")
    private T data;

    public Result() {
    }

    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> Result<T> success(CodeEnum codeEnum, T data) {
        return new Result<>(codeEnum.getCode(), codeEnum.getMessage(), data);
    }

    public static <T> Result<T> success() {
        return success(CodeEnum.SUCCESS, null);
    }

    public static <T> Result<T> success(T data) {
        return success(CodeEnum.SUCCESS, data);
    }

    public static <T> Result<T> error(CodeEnum codeEnum, T data) {
        return new Result<>(codeEnum.getCode(), codeEnum.getMessage(), data);
    }

    public static <T> Result<T> error(T data) {
        return error(CodeEnum.ERROR, data);
    }

    public static <T> Result<T> error(Integer code, String message, T data) {
        return new Result<>(code, message, data);
    }


    public static <T> Result<T> errorMessage(String message) {
        return new Result<>(CodeEnum.ERROR.getCode(), message, null);
    }

    public static <T> Result<T> errorBind(BindingResult bindResult) {
        return new Result<>(CodeEnum.ERROR.getCode(), bindResult.getAllErrors().get(0).getDefaultMessage(), null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" + "code=" + code + ", message='" + message + '\'' + ", data=" + data + '}';
    }
}
