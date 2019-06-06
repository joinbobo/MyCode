package com.dingli.javaee.bean;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private int sex;
    private String favs;
    private int edu;
    private String desc;

    public Student() {
    }

    public Student(int id, String name, int age, int sex, String favs, int edu, String desc) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.favs = favs;
        this.edu = edu;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getFavs() {
        return favs;
    }

    public void setFavs(String favs) {
        this.favs = favs;
    }

    public int getEdu() {
        return edu;
    }

    public void setEdu(int edu) {
        this.edu = edu;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", favs='" + favs + '\'' +
                ", edu=" + edu +
                ", desc='" + desc + '\'' +
                '}';
    }
}
