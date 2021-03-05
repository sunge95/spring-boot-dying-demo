package com.dying.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/6 0:35
 */
@Controller
public class BookController {

    @RequestMapping("/test")
    public String bookTest(){
        return "/index";
    }
}
