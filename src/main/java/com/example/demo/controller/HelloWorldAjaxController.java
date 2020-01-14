package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description TODO 简单的Ajax应用
 * Author Cloudr
 * Date 2020/1/11 16:44
 **/
@RestController
@RequestMapping("/ajax")
public class HelloWorldAjaxController {
    @RequestMapping("/hello")
    public String say(){
        return "hello ajax";
    }
}
