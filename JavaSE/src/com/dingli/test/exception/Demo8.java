package com.dingli.test.exception;

import com.dingli.test.object.Student;
import javafx.scene.Parent;

public class Demo8 {
    public static void main(String[] args) {
        int[] x = new int[10];
//        System.out.println(x[20]);
        String str = "余京";

        "余京".equals(str);   // 这种写法不会出现NullPointerException
        str.equals("余京");   // 如果str == null 会出现NullPointerException

        Object s = new Student();
        Parent p = (Parent) s;
    }
}
