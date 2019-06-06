package com.dingli.test.service.test2;

import com.dingli.test.service.test2.impl.DogImpl;
import com.dingli.test.service.test2.impl.CatImpl;

public class Test2 {
    public static void main(String[] args) {
        /**
         * 创建猫的对象
         */
        CatImpl cat = new CatImpl();
        cat.eat();
        cat.running();

        /**
         * 创建狗的对象
         */
        System.out.println("====================================");
        DogImpl dog = new DogImpl();
        dog.eat();
        dog.running();
    }
}
