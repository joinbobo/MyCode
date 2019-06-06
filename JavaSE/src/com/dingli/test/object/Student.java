package com.dingli.test.object;

import java.io.Serializable;
import java.util.Objects;

//任意定义一个类，如果没有说明父类，那么默认父类为Object
//Object 是任意一个类的直接或者间接父类
public class Student implements Serializable,Cloneable{
    public static final long serialVersionUID = 1L;
    /**
     * serialVersionUID
     *     对象序列化和对象反序列化操作时的版本兼容问题
     *     在对象进行序列化或反序列操作时，要考虑JDK的版本问题
     *     如果序列化的JDK版本和反序列化的JDK版本不统一则就有可能造成异常
     *     所以在序列化操作中引入一个serialVersionUID常量
     *     可能造成异常，所以在序列化操作中引入一个
     *     serialVersionUID常量，可以通过此变量来验证版本的--
     *     在进行反序列化是，
     *     JVM会把传来的字节流中的serialVersionUID与本地相应实体类的serialVersionUID进行比较，
     *     如果相同就认为是一致的，可以进行反序列化，
     *     否则就会出现序列化版本不一致异常
     */

    private String name;
    private int age; //transient 不让数据序列化
    private double scroe;


    public Student(){

    }
    public Student(String name,int age,double scroe){
        this.name = name;
        this.age = age;
        this.scroe = scroe;
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

    public double getScroe() {
        return scroe;
    }



    public void setScroe(double scroe) {
        this.scroe = scroe;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", scroe=" + scroe +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Double.compare(student.scroe, scroe) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, scroe);
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        Student s = new Student("张三",22,3.14);
        //s 可以调用从 Object类继承的所有方法


        System.out.println(s);
        //注意：直接打印，实际上输出的结果是
        //              s.toString()方法的返回值



    }
}
