package com.multi.controller;

import com.multi.frame.Service;
import com.multi.vo.UserVO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {
    public static void main(String[] args) {
       

        ApplicationContext factory = 
        new ClassPathXmlApplicationContext("spring.xml");

        // IoC (Inversion Of Control) 제어 역행
        // Service service = new UserService(); tightly coupled

        Service service =  (Service) factory.getBean("uservice");

        
        UserVO user = new UserVO("id01", "pwd01", "lee");
        service.register(user);
    }
}
