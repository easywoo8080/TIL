package com.day05.day05.controller;

import java.util.Date;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
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

    @RequestMapping("/getdata")
    public Object getdata(){
        JSONArray ja = new JSONArray();
        for(int i = 0; i < 6; i ++ ){
            JSONObject jo = new JSONObject();
            jo.put("id", "id0"+i);
            jo.put("name", "james"+i);
            Random r = new Random();
            int a = r.nextInt(50)+1;

            jo.put("age", a);

            ja.add(jo);
        }
        return ja;
    }


    @RequestMapping("/getchart")
    public Object getchart() {
        JSONArray ja = new JSONArray();
        for (int i = 0; i < 15; i++) {
            Random r = new Random();
            int data = r.nextInt(50)+1;
            ja.add(data);
        }


        return ja;
    }
}
