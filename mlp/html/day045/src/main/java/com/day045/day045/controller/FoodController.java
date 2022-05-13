package com.day045.day045.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoodController {
    
    @RequestMapping("/food")
    public String food(Model m){
        m.addAttribute("center", "food");
        return "main";
    }

    @RequestMapping("/ice")
    public String home1(Model m){
        m.addAttribute("center", "food");
        m.addAttribute("scenter", "food/ice");
        return "main";
    }
}
