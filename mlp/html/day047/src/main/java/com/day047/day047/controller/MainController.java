package com.day047.day047.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    
    @RequestMapping("/")
    public String main(Model m){   
        m.addAttribute("center", "center");
        return "main";
    }


    @RequestMapping("/about")
    public String about(Model m){
        m.addAttribute("center", "about");
        return "main";
    }

    @RequestMapping("/project")
    public String css3(Model m){
        m.addAttribute("center", "project");
        return "main";
    }

    @RequestMapping("/contact")
    public String js(Model m){
        m.addAttribute("center", "contact");
        return "main";
    }

}