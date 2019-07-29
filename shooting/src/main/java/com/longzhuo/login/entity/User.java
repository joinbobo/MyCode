package com.longzhuo.login.entity;

public class User {
    private long uid;
    private String nick;    //昵称
    private String head;    //头像
    private int sex;    //性别
    private int gold;   //金币
    private int material;   //材料
    private int diamond;    //钻石
    private int customs;    //关卡数
    private long logTime;   //登录时间
    private long regTime;   //注册时间
    private long inviterUid;    //邀请人

    public User() {
        System.out.println("进入实体类"+getNick());
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getMaterial() {
        return material;
    }

    public void setMaterial(int material) {
        this.material = material;
    }

    public int getDiamond() {
        return diamond;
    }

    public void setDiamond(int diamond) {
        this.diamond = diamond;
    }

    public int getCustoms() {
        return customs;
    }

    public void setCustoms(int customs) {
        this.customs = customs;
    }

    public long getLogTime() {
        return logTime;
    }

    public void setLogTime(long logTime) {
        this.logTime = logTime;
    }

    public long getRegTime() {
        return regTime;
    }

    public void setRegTime(long regTime) {
        this.regTime = regTime;
    }

    public long getInviterUid() {
        return inviterUid;
    }

    public void setInviterUid(long inviterUid) {
        this.inviterUid = inviterUid;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", nick='" + nick + '\'' +
                ", head='" + head + '\'' +
                ", sex=" + sex +
                ", gold=" + gold +
                ", material=" + material +
                ", diamond=" + diamond +
                ", customs=" + customs +
                ", logTime=" + logTime +
                ", regTime=" + regTime +
                ", inviterUid=" + inviterUid +
                '}';
    }
}
