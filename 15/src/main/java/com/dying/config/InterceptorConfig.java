package com.dying.config;

import com.dying.interceptor.CustomInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/10 15:27
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private CustomInterceptor customInterceptor;

    /**
     * InterceptorRegistry 拦截器的注册中心
     * 注册自定义的拦截器，并且定义拦截规则
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(customInterceptor).addPathPatterns("/**");
    }
}
