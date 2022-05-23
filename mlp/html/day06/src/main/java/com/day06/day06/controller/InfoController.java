package com.day06.day06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InfoController {

    


    @RequestMapping("/info")
    public String info(Model m ){
        m.addAttribute("center", "info/center");
        m.addAttribute("left", "game/left");
        return "main";
    }
}
