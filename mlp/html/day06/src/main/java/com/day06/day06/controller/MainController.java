package com.day06.day06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String main(Model m ){
        return "main";
    }


    @RequestMapping("/login")
    public String login(Model m ){
        m.addAttribute("center", "login");
        m.addAttribute("left", "game/left");
        return "main";
    }
}
