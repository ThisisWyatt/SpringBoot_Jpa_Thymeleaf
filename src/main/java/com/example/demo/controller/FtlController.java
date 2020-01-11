package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Description TODO 测试简单的freemarker
 * Author Cloudr
 * Date 2020/1/10 22:44
 **/
@Controller
public class FtlController {
    @RequestMapping("/helloFtl")
    public String helloFtl(Map<String,Object> map){
        map.put("hello","基于Freemarker");
        return "helloFtl";
    }
}
