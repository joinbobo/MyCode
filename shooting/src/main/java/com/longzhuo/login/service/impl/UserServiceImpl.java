package com.longzhuo.login.service.impl;

import com.longzhuo.login.dao.UserDao;
import com.longzhuo.login.entity.Open;
import com.longzhuo.login.entity.Physical;
import com.longzhuo.login.entity.User;
import com.longzhuo.login.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;

    @Override
    public User selectUser(long uid) {
        return userDao.selectUser(uid);
    }

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public void insertOpen(Open open) {
        userDao.insertOpen(open);
    }

    @Override
    public void insertPhysical(Physical physical) {
        userDao.insertPhysical(physical);
    }

    @Override
    public long selectUserByNick(String nick,String head,int sex) {
        System.out.println("已进入reg服务层"+nick+" "+head+" "+sex);
        return userDao.selectUserByNick(nick,head,sex);
    }

    @Override
    public User loginUser(String nick, String head, int sex) {
        System.out.println("已进入登录服务层:"+nick+" "+head+" "+sex);
        return userDao.loginUser(nick,head,sex);
    }

    @Override
    public long timestamp(long uid,long logTime) {
        System.out.println("已进入时间戳服务层:"+uid+" "+logTime);
        return userDao.timestamp(uid,logTime);
    }
}
