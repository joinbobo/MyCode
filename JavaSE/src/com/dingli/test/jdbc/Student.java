package com.dingli.test.jdbc;

import java.util.Date;

public class Student {
    private long id;
    private String no;
    private int sex;
    private String name;
    private int age;
    private long classNo;
    private Date myBirthday;

    public Student() {
    }

    public Student(long id, String no, int sex, String name, int age, long classNo, Date myBirthday) {
        this.id = id;
        this.no = no;
        this.sex = sex;
        this.name = name;
        this.age = age;
        this.classNo = classNo;
        this.myBirthday = myBirthday;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
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

    public long getClassNo() {
        return classNo;
    }

    public void setClassNo(long classNo) {
        this.classNo = classNo;
    }

    public Date getMyBirthday() {
        return myBirthday;
    }

    public void setMyBirthday(Date myBirthday) {
        this.myBirthday = myBirthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classNo=" + classNo +
                ", myBirthday=" + myBirthday +
                '}';
    }
}
