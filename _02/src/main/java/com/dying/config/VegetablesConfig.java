package com.dying.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Configuration
 * 声明这是一个配置类  在spring中可以替代xml文件
 * @ConfigurationProperties(prefix = "vegetables")
 * 声明这是配置文件类  并且声明前缀
 * @PropertySource("")
 * 声明文件对应的地址
 */
@Configuration
@ConfigurationProperties(prefix = "vegetables")
@PropertySource("vegetables.properties")
// 都可以
//@PropertySource("classpath:vegetables.properties")
@Data
public class VegetablesConfig {
    private String potato;
    private String eggplant;
    private String greenpeper;
}
