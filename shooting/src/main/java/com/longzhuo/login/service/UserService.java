package com.longzhuo.login.service;

import com.longzhuo.login.entity.Open;
import com.longzhuo.login.entity.Physical;
import com.longzhuo.login.entity.User;

public interface UserService {
    User selectUser(long uid);
    void insertUser(User user);

    User loginUser(String nick,String head,int sex);

    /**
     * 用户注册
     * @param open
     */
    void insertOpen(Open open);
    void insertPhysical(Physical physical);
    long selectUserByNick(String nick,String head,int sex);

    long timestamp(long uid,long logTime);
}
