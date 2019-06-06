package com.dingli.test.service.test1;

public class Base {
    /**
     * 商品共同属性
     */
    private String id;//编号
    private String date;//生产日期或者出厂时间

    public Base() {
    }

    public Base(String id, String date) {
        this.id = id;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                ", date='" + date + '\'' +
                '}';
    }
}
