package com.dingli.test.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        try{
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D://考试2文件.txt"));
            byte[] b = new byte[bis.available()];
            bis.read(b);

            System.out.println(new String(b));
            bis.close();
        }catch(IOException e){
            e.printStackTrace();
        }


    }
}
