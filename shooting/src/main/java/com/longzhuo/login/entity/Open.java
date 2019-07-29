package com.longzhuo.login.entity;

public class Open {
    private long uid;
    private String openid;  //用户标识

    public Open() {
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Override
    public String toString() {
        return "Open{" +
                "uid=" + uid +
                ", openid='" + openid + '\'' +
                '}';
    }

}
