package com.example.demo.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Description TODO Springboot 实现RESTful风格web应用 blog Controller
 * Author Cloudr
 * Date 2020/1/14 12:57
 **/
@Controller
@RequestMapping("/blog")
public class BlogController {
    @RequestMapping("/{id}")
    public ModelAndView show (@PathVariable("id")Integer id){
        ModelAndView mav=new ModelAndView();
        mav.addObject("id",id);
        mav.setViewName("blog");
        return mav;
    }
    @RequestMapping("/query")
    public ModelAndView query(@RequestParam(value = "q",required = false)String q){
        ModelAndView mav=new ModelAndView();
        mav.addObject("q",q);
        mav.setViewName("query");
        return mav;
    }

}