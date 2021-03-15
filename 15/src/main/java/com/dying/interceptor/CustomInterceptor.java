package com.dying.interceptor;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/10 15:14
 */
@Service
public class CustomInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("...........CustomInterceptor prehandle...........");
        return true;
        //返回false 下面方法的就不会再执行了
//        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           @Nullable ModelAndView modelAndView) throws Exception {

        System.out.println("...........CustomInterceptor postHandle...........");
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler,
                                @Nullable Exception ex) throws Exception {

        System.out.println("...........CustomInterceptor afterCompletion...........");

    }
}
