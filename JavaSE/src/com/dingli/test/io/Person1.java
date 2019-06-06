package com.dingli.test.io;

import java.io.Serializable;

public class Person1 implements Serializable {
    private String name;
    private int age;

    private Place1 place;

    public Person1() {
    }

    public Person1(String name, int age, Place1 place) {
        this.name = name;
        this.age = age;
        this.place = place;
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

    public Place1 getPlace() {
        return place;
    }

    public void setPlace(Place1 place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", place=" + place +
                '}';
    }

}
