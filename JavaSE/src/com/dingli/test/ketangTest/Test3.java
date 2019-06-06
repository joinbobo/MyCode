package com.dingli.test.ketangTest;

/**
 * String s=”name=zhangsan age=18 classNo=090728”;
 将上面的字符串拆分，结果如下:
 zhangsan  18  090728
 */
public class Test3 {
    public static void main(String[] args){
        String s = "name=zhangsan age=18 classNo=090728";
        String[] strArr1 = s.split(" ");
        //["name=zhangsan","age=18","classNo=090728"]

        //foreach 循环：和for循环是一个意思
        //str 表示数组中的元素
        for(String str : strArr1){
            System.out.print(str.split("=")[1] + "\t");
        }
    }
}
