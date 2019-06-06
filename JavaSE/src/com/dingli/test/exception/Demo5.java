package com.dingli.test.exception;

import com.dingli.test.object.Student;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println(fn());
        System.out.println(ff());
    }

    /**
     *  无论try中是否出现异常，finally块都会执行
     *  而且在try块执行完之后执行
     * @return
     */
    public static int fn(){
        int x = 0;
        return x;
    }

    public static Student ff(){
        Student s = new Student("余京",22,1);
        try{
            return s;
        }finally{
            s.setName("ddd");
            s = new Student("王江平",22,1);
            return s;
        }
        // 有一个返回值域，存的是返回的地址
        // 一定要有return 才会改变返回值域的结果
    }
}
