package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description TODO 测试简单Thymeleaf应用
 * Author Cloudr
 * Date 2020/1/9 19:55
 **/
@Controller
@RequestMapping("/user")//用来处理请求地址映射的注解(可以默认不写)
public class UserController {
    @Resource
    private UserServiceImpl userService;

    @RequestMapping("/test")
    public String test(Model model){//model :一个接口，可以吧查询出来的数据设置到该类中
        List<User> userss=userService.findByNameLike("%1%");
        model.addAttribute("users",userss);
        return "u";//u.html
    }
}
