package com.dying.listener;

import com.dying.event.CustomEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/9 15:11
 */
@Component
public class CustomListener3 {

    @EventListener
    public void eventListener(CustomEvent event){
        event.printMessage("CustomListener3监听到了");
    }
}
