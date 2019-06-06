package com.dingli.test.io;

import java.io.File;

public class Demo4 {
    public static void main(String[] args) {
        String path = "D:/Program Files (x86)/idea/ideaDemo/src/com/dingli/test";

        File f = new File(path);
        System.out.println(f.getPath());
        print(f.listFiles(),"");
        // listFiles 如果调用该方法的文件对象不是目录，那么返回null
    }
    public static void print(File[] list,String space){
        for(File f : list){
            System.out.println(space + "|--" + f.getName());
            // getName返回对应文件对象的最后一层
            // 如果是文件夹，就是文件夹的名称
            // 如果是文件，就是文件的名称（包括后缀名）
            if(f.isDirectory()){
                space += "\t";
                print(f.listFiles()," ");
            }
        }
    }
}
