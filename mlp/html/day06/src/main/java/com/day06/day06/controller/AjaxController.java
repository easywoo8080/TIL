package com.day06.day06.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxController {


    @RequestMapping("/loginidcheck")
    public Object idcheck(String id){
        String result = "";
        if( id.equals("a") || id.equals(("b")) || id.equals("c") ){
            result = "0";
        }else{
            result = "1";
        }
        return result;
    }
}
