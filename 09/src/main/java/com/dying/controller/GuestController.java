package com.dying.controller;

import com.dying.model.Guest;
import com.dying.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/7 0:05
 */
@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @GetMapping
    public String findAll(Model model){
        //方法一
//        List<Guest> all = guestService.findAll();

        //方法二
        List<Guest> all = guestService.list();
        model.addAttribute("allGuest",all);
        return "list";
    }
}
