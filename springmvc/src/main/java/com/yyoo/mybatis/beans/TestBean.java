package com.yyoo.mybatis.beans;

public class TestBean {
    private String name;
    private int age;
    private long id;
    private String remark;

    public TestBean() {
    }

    public TestBean(String name, int age, long id, String remark) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.remark = remark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", remark='" + remark + '\'' +
                '}';
    }
}
