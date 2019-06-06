package com.dingli.test.object;

import java.util.Objects;

// Comparable 的意思是，使 Teacher 对象可比较
public class Teacher implements Comparable<Teacher>{
    private String name;
    private int age;

    public Teacher(){
    }
    public Teacher(String name,int age){
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
    public int compareTo(Teacher o) {
        return this.getAge() - o.getAge();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return age == teacher.age &&
                Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }
}
