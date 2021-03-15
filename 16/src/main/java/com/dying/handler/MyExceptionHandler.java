package com.dying.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/10 17:17
 */
//Controller处理时，抛出的任何异常都会被 @ControllerAdvice接受到  aop
@ControllerAdvice
public class MyExceptionHandler {

    //处理何种异常
    @ExceptionHandler(Exception.class)
    public ModelAndView handler(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/error");
        mv.addObject("message",e.getMessage());
        return mv;
    }
}
