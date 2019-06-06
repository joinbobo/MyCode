package com.yyoo.springmvc.controller;

import com.yyoo.springmvc.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/json")
public class JsonController {

    @RequestMapping("/test.action")
    @ResponseBody
    public Person test(){
        return new Person("张三",20,new Date());
    }
}
