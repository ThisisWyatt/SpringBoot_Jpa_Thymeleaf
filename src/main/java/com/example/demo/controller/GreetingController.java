package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description TODO 测试通过地址栏传值访问页面
 * Author Cloudr
 * Date 2020/1/10 21:50
 **/
@Controller//返回的默认结果为视图，此处是html文件
public class GreetingController {
    @GetMapping("/greeting")
    @ResponseBody//修改@Controller的返回结果，返回结果是字符串
    public String greeting(){
        System.out.println("hello");
        return "hello greeting";
    }
    @GetMapping("/hi")
    public String hi(@RequestParam(name = "name",required = false,defaultValue = "world")
                                 String name, Model model){//@RequestParam:就请求中带的值赋给方法参数
        model.addAttribute("name",name);
        return "hi";
    }

    /**
     *@Descriptuion TODO thymeleaf模板片段的定义和引用
    **/
    @GetMapping("/testFooter")
    public String testFooter(){
        return "testFooter";
    }
    @GetMapping("/footer")
    public String footer(){
        return "footer";
    }
}
