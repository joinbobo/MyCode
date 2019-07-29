package com.longzhuo.login.controller;

import com.longzhuo.login.entity.Open;
import com.longzhuo.login.entity.Physical;
import com.longzhuo.login.entity.User;
import com.longzhuo.login.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/select")
    public ModelAndView selectUser() throws Exception {
        ModelAndView mv = new ModelAndView();
        User user = userService.selectUser(1);
        mv.addObject("user", user);
        mv.setViewName("user");
        System.out.println("mv的值："+mv);
        return mv;
    }


    @RequestMapping(value="/userById",method=RequestMethod.POST)
    @ResponseBody
    public JSONObject login(@RequestParam("uid") long uid){
        JSONObject jsonObject = new JSONObject();
        User user = userService.selectUser(uid);


//        if("".equals(uid)){
//            jsonObject.put("result","id为空");
//        }else if(user.getUid() == uid){
//            jsonObject.put("result","登录成功！");
//        }else{
//            jsonObject.put("result","登录失败！");
//        }
//        System.out.println("进入后端"+jsonObject);
        return jsonObject;
    }

    @RequestMapping(value="/insertUser",method=RequestMethod.POST)
    @ResponseBody
    public JSONObject insertUser(@RequestParam String nick,@RequestParam String head,@RequestParam int sex,@RequestParam long inviterUid){
        System.out.println("reg步入后端");
        JSONObject jsonObject = new JSONObject();
        User user = new User();
        user.setNick(nick);
        user.setHead(head);
        user.setSex(sex);
        user.setLogTime(System.currentTimeMillis());
        user.setRegTime(System.currentTimeMillis());
        user.setInviterUid(inviterUid);
        userService.insertUser(user);
        System.out.println("添加用户成功！"+user);

        /**
         * 添加唯一标识
         */
        Open open = new Open();
        System.out.println("创建对象成功");

        open.setUid(userService.selectUserByNick(nick,head,sex));
        open.setOpenid("qqrrwer");     //启动tomcat先提前修改唯一标识码
        System.out.println("open添加参数成功！"+open);
        userService.insertOpen(open);
        System.out.println("添加唯一标识成功！");


        /**
         * 添加体力
         */
        System.out.println("进入体力添加");
        Physical physical = new Physical();
        physical.setUid(userService.selectUserByNick(nick,head,sex));
        physical.setPhysical(20);

        physical.setBigTime(System.currentTimeMillis());
        System.out.println("physical"+physical);
        userService.insertPhysical(physical);
        System.out.println("添加体力成功！");


        System.out.println("事务完成，当前："+user);
        System.out.println("当前时间戳:"+System.currentTimeMillis());
        jsonObject.put("result","注册成功！");
        return jsonObject;
    }


    @RequestMapping(value="/login",method=RequestMethod.POST)
    @ResponseBody
    public JSONObject selectUser(@RequestParam("nick") String nick,@RequestParam("head") String head,@RequestParam("sex") int sex){
        System.out.println("login步入后端");
        JSONObject jsonObject = new JSONObject();

        User user = userService.loginUser(nick,head,sex);
        System.out.println("user:"+user);
        if(user != null){
            userService.timestamp(user.getUid(),System.currentTimeMillis());
            System.out.println("登录成功，更改登录时间成功！");
            jsonObject.put("result","登录成功！");
        }else{
            jsonObject.put("result","登录失败！");
        }
        return jsonObject;
    }


}
