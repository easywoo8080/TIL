package com.day03ws.day03ws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    
    @RequestMapping
    public ModelAndView main(ModelAndView mv){
        mv.setViewName("main");
        return mv;
    }
}
