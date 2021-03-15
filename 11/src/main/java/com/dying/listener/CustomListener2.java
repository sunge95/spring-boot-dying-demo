package com.dying.listener;

import com.dying.event.CustomEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/9 14:27
 */
@Component
public class CustomListener2 implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {
        event.printMessage("CustomListener2监听到了");
    }

}
