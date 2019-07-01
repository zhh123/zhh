package com.zhh.jenkins.jenkinsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:zhh
 * @Date:Created in 14:01 2019/7/1 0001
 */
@RestController
public class HomeController {

    @RequestMapping("test")
    public String test(){
        System.out.println("this is first jenkins");
        return "ok";
    }
}