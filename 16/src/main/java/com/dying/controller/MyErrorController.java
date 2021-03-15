package com.dying.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/10 17:13
 */
@Controller
public class MyErrorController {

    @RequestMapping("/error404")
    public String error404(){
        return "error404";
    }


    @RequestMapping("/testError")
    public String error() throws Exception{
        //抛出的异常会被 @ControllerAdvice监听到
        // 然后由  @ExceptionHandler(Exception.class) 处理

        // 可以将 "测试异常" 这个信息传到
        // mv.addObject("message",e.getMessage()); 中
        throw new Exception("测试异常");
    }
}
