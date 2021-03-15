package com.dying.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Description: 自定义健康指标
 *
 * @author:SunG
 * @date 2021/3/14 16:11
 */
@Component
public class CustomHealth implements HealthIndicator {

    @Override
    public Health health() {
        int errorCode = 1;  //check()
        if (errorCode != 0) {
            //返回不健康的指标  并且返回具体的code值
            return Health.down().withDetail("ErrorCode", errorCode).build();
        }
        //返回健康指标
        return Health.up().build();
    }
}
