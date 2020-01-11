package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description TODO 输出application.properties中配置数据
 * Author Cloudr
 * Date 2020/1/9 23:42
 **/
@RestController
public class printMysqlInfo {
    @Value("${spring.datasource.username}")
    private String userName;
    @RequestMapping("/showJdbc")
    public String showJdbc(){
        return "mysql.userName:"+userName+"<br/>";
    }
}
