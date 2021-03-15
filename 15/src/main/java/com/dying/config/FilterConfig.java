package com.dying.config;

import com.dying.filter.CustomFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/10 14:45
 */
@Configuration //代表这是一个xml文件
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<CustomFilter> filterRegistrationBean(){
        FilterRegistrationBean<CustomFilter> filterFilterRegistrationBean =
                new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(new CustomFilter());
        //设置过滤规则
        filterFilterRegistrationBean.addUrlPatterns("/*");
        //决定注册的优先级 越小优先级越高
        filterFilterRegistrationBean.setOrder(0);
        return filterFilterRegistrationBean;
    }
}
