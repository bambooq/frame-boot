package com.newland.iot.mediaserver.exception;

/**
 * Created by zk on 2017/7/21.
 */
public class BusinessException extends Exception {

    private int exCode;
    private String exMsg;

    private static final long serialVersionUID = 1L;

    public BusinessException() {
    }

    public BusinessException(int exCode, String exMsg) {
        super(exMsg+"(错误码:"+exCode+")");
        this.exCode = exCode;
        this.exMsg = exMsg;
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public int getExCode() {
        return exCode;
    }

    public String getExMsg() {
        return exMsg;
    }

    public String getExCodeMsg() {
        return exCode + "," + exMsg;
    }
}
