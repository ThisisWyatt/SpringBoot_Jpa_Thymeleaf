package com.example.demo.controller;

import com.example.demo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Description TODO 带bootstrap和jQuery的web应用
 * Author Cloudr
 * Date 2020/1/14 13:36
 **/
@Controller
public class BJController {
    @RequestMapping("/bj")
    public String index(Model model){
        Person single=new Person("张1",11,"徐州");
        List<Person> people=new ArrayList<Person>();
        Person p1=new Person("张2",22,"徐州");
        Person p2=new Person("张3",33,"徐州");
        Person p3=new Person("张4",44,"徐州");
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson",single);
        model.addAttribute("people",people);
        return "BJ_index";
    }
}
