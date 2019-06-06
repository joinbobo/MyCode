package com.dingli.test.io;

import java.io.File;
import java.io.IOException;

public class Demo2 {    // 有问题
    public static void main(String[] args) {
        // 创建一个文件： D:/aaa/bbb/test.txt
        File f = new File("D:/aaa/bbb/test.txt");
        // getParentFile获得当前的父文件夹D:/aaa/bbb
        f.getParentFile().mkdirs();  // 把路径上没有创建的文件夹
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
