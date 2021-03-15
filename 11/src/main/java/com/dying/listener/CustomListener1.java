package com.dying.listener;

import com.dying.event.CustomEvent;
import org.springframework.context.ApplicationListener;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/7 22:36
 */
public class CustomListener1 implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.printMessage("CustomListener1监听到了");
    }
}
