package com.yyoo.springmvc.controller;

import com.yyoo.springmvc.bean.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/rest")
public class TestRestController {

    @RequestMapping("/test.action")
    public Person getPerson(){
        return new Person("李四",18,new Date());
    }
}
