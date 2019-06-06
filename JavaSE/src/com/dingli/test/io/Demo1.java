package com.dingli.test.io;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
        File f = new File("D:/","test");
        try {
            f.createNewFile();  // 创建一个文件
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 创建一个文件夹
        File f1 = new File("D:/RuanJianJava");
        f1.mkdir(); // 创建目录
    }
}
