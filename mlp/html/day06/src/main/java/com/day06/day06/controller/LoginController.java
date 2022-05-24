package com.day06.day06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(Model m ){
        m.addAttribute("center", "login/login");
        
        return "main";
    }

    @RequestMapping("/logincheck")
    public String logincheck(Model m, String email, String pwd ){
        System.out.println("logincheck");
        m.addAttribute("center", "login/loginok");
        m.addAttribute("email", email);
        m.addAttribute("pwd", pwd);
        return "main";
    }

}


