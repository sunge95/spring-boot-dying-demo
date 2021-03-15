package com.dying.config;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/9 17:28
 */
@Component
public class ListenerConfig {

    @EventListener(WebServerInitializedEvent.class)
    public void onWebServerReady(WebServerInitializedEvent event){
        System.out.println("WebServerInitializedEvent---当前webserver的实现类为："
        + event.getWebServer().getClass().getName());
    }
}
