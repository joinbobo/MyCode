package com.longzhuo.login.entity;

public class Physical {
    private long uid;
    private int physical;   //用户体力
    private long bigTime;   //体力恢复时间

    public Physical() {
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public int getPhysical() {
        return physical;
    }

    public void setPhysical(int physical) {
        this.physical = physical;
    }

    public long getBigTime() {
        return bigTime;
    }

    public void setBigTime(long bigTime) {
        this.bigTime = bigTime;
    }

    @Override
    public String toString() {
        return "Physical{" +
                "uid=" + uid +
                ", physical=" + physical +
                ", bigTime=" + bigTime +
                '}';
    }
}
