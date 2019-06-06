package com.dingli.test.io;

public class Person implements Cloneable{

    private String name;
    private int age;

    private Place place;

    public Person() {
    }

    public Person(String name, int age, Place place) {
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

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person p = (Person)super.clone();
        p.setPlace((Place)p.getPlace().clone());
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", place=" + place +
                '}';
    }
}
