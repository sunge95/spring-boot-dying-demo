package com.dying.controller;

import com.dying.event.CustomEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/7 22:43
 */
@RestController
public class CustomController {
    @Autowired
    private ApplicationEventPublisher publisher;

    @GetMapping
    public String event(){
        publisher.publishEvent(new CustomEvent(this));
        return "success";
    }
}
