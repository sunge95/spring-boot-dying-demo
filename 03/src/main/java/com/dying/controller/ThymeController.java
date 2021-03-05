package com.dying.controller;

import com.dying.bean.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ThymeController {

    @RequestMapping("/thyme")
    public String index(Model model){
        model.addAttribute("name","<h1>Thymeleaf</h1>");

        Restaurant restaurant = new Restaurant();
        restaurant.setBoss("狗");
        restaurant.setChef("猫");
        model.addAttribute("user",restaurant);
        return "/thymeleaf/index";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "thymeleaf/welcome";
    }
}
