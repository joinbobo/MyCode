package com.yyoo.springmvc.controller;

import com.yyoo.springmvc.bean.Person;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @RequestMapping("/query.action")
    public Person query(@RequestBody Person p){
        return p;
    }
}
