package com.newland.iot.mediaserver.web.controller.user;


import com.newland.iot.mediaserver.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping("/list")
    @ResponseBody
    public Object list() {
        // 自己编写的除0异常
//        int a=1/0;
        return userService.selectList();
    }

    //局部异常处理
/*    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String exHandler(Exception e){
        // 判断发生异常的类型是除0异常则做出响应
        if(e instanceof ArithmeticException){
            return "局部异常处理-发生了除0异常";
        }
        // 未知的异常做出响应
        return "局部异常处理-发生了未知异常";
    }*/
}
