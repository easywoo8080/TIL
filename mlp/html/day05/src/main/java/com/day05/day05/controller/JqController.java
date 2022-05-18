package com.day05.day05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JqController {
    
    @RequestMapping("/loginimpl")
    public String loginimpl(Model m, String id, String pwd) {
        System.out.println(id + "  " + pwd);
        if( id.equals("qq") && pwd.equals("11")){
            m.addAttribute("loginid", id);
            m.addAttribute("center", "jquery/loginok");
        }else{
            m.addAttribute("center", "jquery/loginfail");
        }
        m.addAttribute("left", "jquery/left");
        return "main";
    }

    @RequestMapping("/registerimpl")
    public String registerimpl(Model m, String usrName, String pwdName, String ch, String optradio, int sel ) {
        System.out.printf("%s, %s, %s, %s, %d", usrName, pwdName, ch, optradio, sel);
        m.addAttribute("rname", usrName);
        m.addAttribute("center", "jquery/registerok");
            
        m.addAttribute("left", "jquery/left");
        return "main";
    }
   

    @RequestMapping("/jq")
    public String jq(Model m) {
        m.addAttribute("center", "jquery/center");
        m.addAttribute("left", "jquery/left");
        return "main";
    }

    @RequestMapping("/jq01")
    public String jq01(Model m) {
        m.addAttribute("center", "jquery/jq01");
        m.addAttribute("left", "jquery/left");
        return "main";
    }

    @RequestMapping("/jq02")
    public String jq02(Model m) {
        m.addAttribute("center", "jquery/jq02");
        m.addAttribute("left", "jquery/left");
        return "main";
    }

    @RequestMapping("/jq03")
    public String jq03(Model m) {
        m.addAttribute("center", "jquery/jq03");
        m.addAttribute("left", "jquery/left");
        return "main";
    }

    @RequestMapping("/jq04")
    public String jq04(Model m) {
        m.addAttribute("center", "jquery/jq04");
        m.addAttribute("left", "jquery/left");
        return "main";
    }

    @RequestMapping("/jq05")
    public String jq05(Model m) {
        m.addAttribute("center", "jquery/jq05");
        m.addAttribute("left", "jquery/left");
        return "main";
    }

    @RequestMapping("/jq06")
    public String jq06(Model m) {
        m.addAttribute("center", "jquery/jq06");
        m.addAttribute("left", "jquery/left");
        return "main";
    }

    @RequestMapping("/jq07")
    public String jq07(Model m) {
        m.addAttribute("center", "jquery/jq07");
        m.addAttribute("left", "jquery/left");
        return "main";
    }

    @RequestMapping("/jq08")
    public String jq08(Model m) {
        m.addAttribute("center", "jquery/jq08");
        m.addAttribute("left", "jquery/left");
        return "main";
    }

    @RequestMapping("/jq09")
    public String jq09(Model m) {
        m.addAttribute("center", "jquery/jq09");
        m.addAttribute("left", "jquery/left");
        return "main";
    }

    @RequestMapping("/jq10")
    public String jq10(Model m) {
        m.addAttribute("center", "jquery/jq10");
        m.addAttribute("left", "jquery/left");
        return "main";
    }
    
    @RequestMapping("/jq11")
    public String jq11(Model m) {
        m.addAttribute("center", "jquery/jq11");
        m.addAttribute("left", "jquery/left");
        return "main";
    }

    @RequestMapping("/jq12")
    public String jq12(Model m) {
        m.addAttribute("center", "jquery/jq12");
        m.addAttribute("left", "jquery/left");
        return "main";
    }

    @RequestMapping("/jq13")
    public String jq13(Model m) {
        m.addAttribute("center", "jquery/jq13");
        m.addAttribute("left", "jquery/left");
        return "main";
    }

    @RequestMapping("/jq14")
    public String jq14(Model m) {
        m.addAttribute("center", "jquery/jq14");
        m.addAttribute("left", "jquery/left");
        return "main";
    }

    @RequestMapping("/jq15")
    public String jq15(Model m) {
        m.addAttribute("center", "jquery/jq15");
        m.addAttribute("left", "jquery/left");
        return "main";
    }

}
