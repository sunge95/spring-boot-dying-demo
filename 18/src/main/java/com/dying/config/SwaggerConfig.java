package com.dying.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Configuration
 * 首先声明是配置文件类
 * @EnableSwagger2
 * 开启swagger功能
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * 使用swagger需要创建一个摘要  Docket 让swagger可以显示出来
     * 摘要参数如下：
     * 文档类型 - 使用swagger2 -  DocumentationType.SWAGGER_2
     * 文档通过一系列的选择器组成  1个选择器时 api  另一个是 path
     * select()设置apis()和paths()
     * apis 查找生成哪些controller的接口
     *        获取所有RequestHandlerSelectors.any()
     * path 在查找出来的接口中进行筛选
     * @return
     */
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).select()
//                .apis(RequestHandlerSelectors.any())
                // 扫描指定的包
                .apis(RequestHandlerSelectors.basePackage("com.dying.controller"))
                .paths(PathSelectors.any())
                .build()
                // 加入 apiinfo 信息
                .apiInfo(apiInfo());
    }

    /**
     * 自定义文档的介绍
     * 通过ApiInfoBuilder创建ApiInfo
     * 参数可以设置  title description version 标题  描述  版本等等
     * @return
     */
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("spring-boot-swagger-test")
                .description("这是一个简单的swagger测试")
                .version("2.0")
                .build();
    }
}
