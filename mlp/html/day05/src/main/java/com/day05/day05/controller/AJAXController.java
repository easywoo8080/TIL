package com.day05.day05.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AJAXController {
    

    @RequestMapping("/gettime")
    public Object gettime() {
        Date d = new Date();
        return "서버시간 : " + d.toString();  
    }

    @RequestMapping("/checkid")
    public Object checkid(String id) {
        String result = "";
        if( id.equals("aaa") || id.equals("bbb") || id.equals("ccc")){
            result = "0";
        }else{
            result = "1";
        }
        return result;  
    }

    @RequestMapping("/aj04Checked")
    public Object aj04Checked(String id){
        String result = "";
        if( id.equals("a") || id.equals(("b"))){
            result = "0";
        }else{
            result = "1";
        }
        return result;
    }
    
    
    @RequestMapping("/search")
    public Object search(String s){

        if(s.equals("a")){
            return "주식에 관심";
        }else if(s.equals("b")){
            return "햄버거에 관심";
        }else{
            return "밥에 관심";
        }
        
    }
}
