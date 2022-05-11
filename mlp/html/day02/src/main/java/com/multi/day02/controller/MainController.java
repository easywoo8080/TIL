package com.multi.day02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class MainController {
    
    @RequestMapping("/")
    public ModelAndView main(ModelAndView mv){
        mv.setViewName("main");
        return mv;
    }
}
