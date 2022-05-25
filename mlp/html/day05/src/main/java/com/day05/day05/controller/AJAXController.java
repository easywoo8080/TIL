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


    @RequestMapping("/getmarkers")
    public Object getmarkers(String loc){
        JSONArray ja = new JSONArray();
        if( loc.equals("s")){
            JSONObject jo1 = new JSONObject();
            jo1.put("content", "<div>카카오</div>");
            jo1.put("lat", 37.55041692365908);
            jo1.put("lng", 126.91037178013711);
            jo1.put("target", "js01");
            ja.add(jo1);
            JSONObject jo2 = new JSONObject();
            jo2.put("content", "<div>생태연못</div>");
            jo2.put("lat", 37.55021692365908);
            jo2.put("lng", 126.91027178013711);
            jo2.put("target", "js02");
            ja.add(jo2);
            JSONObject jo3 = new JSONObject();
            jo3.put("content", "<div>슈퍼마켓</div>");
            jo3.put("lat", 37.55061692365908);
            jo3.put("lng", 126.91237178013711);
            jo3.put("target", "js03");
            ja.add(jo3);
        }else if(loc.equals("b")){
            JSONObject jo1 = new JSONObject();
            jo1.put("content", "<div>부산대</div>");
            jo1.put("lat", 35.17442453774257);
            jo1.put("lng", 129.16869784099807);
            jo1.put("target", "js04");
            ja.add(jo1);
            JSONObject jo2 = new JSONObject();
            jo2.put("content", "<div>부산동산</div>");
            jo2.put("lat", 35.17142453774257);
            jo2.put("lng", 129.16769784099807);
            jo2.put("target", "js05");
            ja.add(jo2);
            JSONObject jo3 = new JSONObject();
            jo3.put("content", "<div>부산아파트</div>");
            jo3.put("lat", 35.17422453774257);
            jo3.put("lng", 129.16569784099807);
            jo3.put("target", "js06");
            ja.add(jo3);
        }else if(loc.equals("k")){
            
        }
        return ja;
    }
}
