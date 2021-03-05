package com.dying.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/5 21:50
 */
@Controller
public class FtlController {

    @RequestMapping("/ftl")
    public String index(Model model){
        //Model 是 数据和模板的结合
        model.addAttribute("now",new Date().toString());
        return "freemarker/index";
    }
}
