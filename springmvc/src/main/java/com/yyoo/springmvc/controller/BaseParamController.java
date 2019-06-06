package com.yyoo.springmvc.controller;

import com.yyoo.springmvc.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/param")
public class BaseParamController {

    @RequestMapping("/test1.action")
    public String getParam(HttpServletRequest request){
        String name = request.getParameter("name");
//        try {
//            System.out.println(new String(name.getBytes("ISO-8859-1"),"UTF-8"));
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        System.out.println(name);
        return "test/aaa";
    }

    @RequestMapping(value = "/test2.action",method = RequestMethod.POST)
    public String getParam1(String name){
        System.out.println(name);
        return "test/aaa";
    }

    @RequestMapping("/{name}/test3.action")
    public String getParam2(@PathVariable String name){
        System.out.println(name);
        return "test/aaa";
    }

    @RequestMapping("/test4.action")
    @ResponseBody
    public Person getRequestBody(@RequestBody Person p){
        //@RequestBody 表示接受一个前端传送的Json对象，用Person对象来接收
        return p;
    }
}
