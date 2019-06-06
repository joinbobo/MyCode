package com.dingli.test.io;

import java.io.File;

public class Demo3 {
    public static void main(String[] args) {
        // 删除创建的aaa文件夹
        File f = new File("D:/aaa");
        delete(new File[] {f});
    }
    public static void delete(File[] fList){
        for(File f : fList){
            if(f.isDirectory()){    // 判断当前File对象是否是文件夹
                delete(f.listFiles()); // 获取当前文件夹下所有的文件（包括文件夹）
            }else{
                f.delete();
            }
        }
    }
}

