package com.demon.api.common.vo;

/**
 * @ClassName Result
 * @Descriotion 返回信息
 * @Author Demon
 * @Date 2021/2/4 23:52
 **/
public class Result<T> {

    private int code;
    private String msg;
    private T data;


    private Result(T data) {
        this.code = 1000;
        this.msg = "success";
        this.data = data;
    }

    private Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 成功 默认code 1000
     *
     * @param data 数据
     * @return {@link Result<T>}
     */
    public static <T> Result<T> success(T data) {
        return new Result<T>(data);
    }

    /**
     * 成功
     *
     * @param code 错误码
     * @param msg  消息
     * @param data 数据
     * @return {@link Result<T>}
     */
    public static <T> Result<T> success(int code, String msg, T data) {
        return new Result<T>(code, msg, data);
    }

    /**
     * 失败
     *
     * @param data 数据
     * @return {@link Result<T>}
     */
    public static <T> Result<T> fail(T data) {
        return new Result<T>(1001, "fail", data);
    }

    /**
     * 失败
     *
     * @param msg 味精
     * @return {@link Result<T>}
     */
    public static <T> Result<T> fail(String msg) {
        return new Result<T>(1001, msg, null);
    }

    /**
     * 失败
     *
     * @param code 错误码
     * @param msg  消息
     * @param data 数据
     * @return {@link Result<T>}
     */
    public static <T> Result<T> fail(int code, String msg, T data) {
        return new Result<T>(code, msg, data);
    }

    public int getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }


    public T getData() {
        return data;
    }


}
