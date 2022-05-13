package com.day046.day046.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class MainController {
    
    public String main(Model m){
        
        return "index";
    }

}
