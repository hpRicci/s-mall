package com.itheima.reggie.exception;

/**
 * 自定义业务异常
 * @author 陈万三
 * @create 2023-03-17 14:15
 */
public class BusinessException extends RuntimeException{

    public BusinessException(String message){
        super(message);
    }
}
