package com.newland.iot.mediaserver.web.exceptionhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice(basePackages = {"com.newland.iot.mediaserver.web"})
public class GlobalDefaultExceptionHandler {

    /**
     * 全局异常处理返回字符串
     */
    /*
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String exceptionRetStr(Exception e){
        // 判断发生异常的类型是除0异常则做出响应
        if(e instanceof ArithmeticException){
            return "全局：发生了除0异常";
        }
        // 未知的异常做出响应
        return "全局：发生了未知异常";
    }
    */

    /**
     * 全局异常处理返回JSON
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String,Object> exceptionRetMap(Exception e){
        Map<String,Object> map=new HashMap<String,Object>();
        // 判断发生异常的类型是除0异常则做出响应
        if(e instanceof ArithmeticException){
            map.put("codeNumber", "1");
            map.put("message", e.getMessage());
            return map;
        }
        // 未知的异常做出响应
        map.put("codeNumber", "0");
        map.put("message", e.getMessage());
        return map;
    }

    /**
     * 全局异常处理返回jsp页面
     */
    /*
    @ExceptionHandler(Exception.class)
    public String exceptionRetJsp(Exception e){
        // 判断发生异常的类型是除0异常则做出响应
        if(e instanceof ArithmeticException){
            // 跳转到test.jsp页面
            return "test";
        }
        // 未知的异常做出响应
        // 跳转到test.jsp页面
        return "test";
    }
    */
}
