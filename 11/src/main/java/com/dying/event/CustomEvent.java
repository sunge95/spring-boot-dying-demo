package com.dying.event;

import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.context.ApplicationEvent;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/7 22:32
 */
public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source) {
        super(source);
    }

    public void printMessage(String msg) {
        System.out.println("自定义事件，打印信息：" + msg);
    }
}
