package com.dying.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/7 13:43
 */
@Configuration
public class DBConfig {

    @Bean("db1")
    @ConfigurationProperties("spring.datasource.db1")
    public DataSource db1() throws Exception{
        return DataSourceBuilder.create().build();
    }

    @Bean("db2")
    @ConfigurationProperties("spring.datasource.db2")
    public DataSource db2() throws Exception{
        return DataSourceBuilder.create().build();
    }
}
