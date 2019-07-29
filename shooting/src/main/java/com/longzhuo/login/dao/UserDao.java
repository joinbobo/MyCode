package com.longzhuo.login.dao;

import com.longzhuo.login.entity.Open;
import com.longzhuo.login.entity.Physical;
import com.longzhuo.login.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    /**
     * 指定id查询用户
     * @param id
     * @return
     */
    User selectUser(long id);

    /**
     * 用户登录
     * @param nick
     * @param head
     * @param sex
     * @param inviterUid
     * @return
     */
    User loginUser(String nick,String head,int sex);

    /**
     * 用户添加
     * @param user
     */
    void insertUser(User user);

    /**
     * 给用户添加唯一标识
     * @param uid
     */
    void insertOpen(Open open);

    /**
     * 给用户添加体力表
     * @param physical
     */
    void insertPhysical(Physical physical);

    /**
     * 获取用户uid
     * @param nick
     * @param head
     * @param sex
     * @return
     */
    long selectUserByNick(String nick,String head,int sex);

    /**
     * 更改登录后的时间戳
     * @param uid
     * @param logTime
     * @return
     */
    long timestamp(@Param("uid") long uid, @Param("logTime")long logTime);
}
