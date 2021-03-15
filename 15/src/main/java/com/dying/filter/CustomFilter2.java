package com.dying.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 注意 ：
 * 1、{"/*"} 大括号不能丢
 * 2、添加 @ServletComponentScan 否则这个过滤器无法使用
 */
@WebFilter(filterName = "customFilter2",urlPatterns = {"/*"})
public class CustomFilter2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(".............CustomFilter2 init............");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(".............CustomFilter2 doFilter............");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println(".............CustomFilter2 destroy............");
    }
}
