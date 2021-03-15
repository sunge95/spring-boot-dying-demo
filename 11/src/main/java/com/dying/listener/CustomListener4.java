package com.dying.listener;

import com.dying.event.CustomEvent;
import org.springframework.context.ApplicationListener;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/9 15:12
 */
public class CustomListener4 implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {
        event.printMessage("CustomListener4监听到了");
    }
}
