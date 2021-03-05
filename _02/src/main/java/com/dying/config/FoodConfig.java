package com.dying.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/5 18:20
 */
@Data
@ConfigurationProperties(prefix = "food")
public class FoodConfig {
    private String meat;
    private String rice;
    private String[] sauce;
}
