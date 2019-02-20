package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDemo {

    @RequestMapping("/print")
    public String print(){
        System.out.println("成功");
        return "启动成功";
    }
}
