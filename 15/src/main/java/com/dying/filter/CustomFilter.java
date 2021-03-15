package com.dying.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * <filter>
 *     <filter-name></filter-name>
 *     <filter-class></filter-class>
 * </filter>
 * <filter-mapping>
 *     <filter-name></filter-name>
 *     <url-pattern></url-pattern>
 * </filter-mapping>
 *
 * @author:SunG
 * @date 2021/3/10 14:46
 */
public class CustomFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(".............CustomFilter1 init............");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("............CustomFilter1 doFilter............");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println(".............CustomFilter1 destroy............");
    }
}
