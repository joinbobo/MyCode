package com.yyoo.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("/test.action")
    public String test(){
        return "test/aaa";
    }

    @RequestMapping("/test1.action")
    public ModelAndView test1(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("name","张三");
        map.put("age","20");

        ModelAndView mv = new ModelAndView("test/test1",map);
        return mv;
    }
}
