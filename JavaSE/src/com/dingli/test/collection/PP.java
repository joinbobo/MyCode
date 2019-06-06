package com.dingli.test.collection;

import java.util.Objects;

public class PP implements Comparable<PP> {
    private String name;
    private int age;

    public PP() {
    }
    public PP(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PP pp = (PP) o;
        return age == pp.age &&
                Objects.equals(name, pp.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }


    @Override
    public String toString() {
        return "PP{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(PP o) {
        return this.getAge() - o.getAge();
    }
}
