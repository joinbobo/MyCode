package com.dingli.test.service.test3;

public class Test3 {
    public static void main(String[] args) {
        /**
         * 创建猫的对象
         */
        Cat cat = new Cat();
        cat.name = "加菲猫";
        cat.age = 3;
        System.out.println("猫的名字："+cat.name);
        System.out.println("猫的年龄："+cat.age);
        cat.cry();

        /**
         * 创建狗的对象
         */
        System.out.println("====================================");
        Dog dog = new Dog();
        dog.name = "金毛";
        dog.age = 10;
        System.out.println("狗的名字："+dog.name);
        System.out.println("狗的年龄："+dog.age);
        dog.cry();
    }
}
