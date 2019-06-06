package com.dingli.test.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Demo9 {
    public static void main(String[] args) {
        Writer w = null;
        try {
            w = new FileWriter("D:/tt.txt");
            w.write("哈哈哈哈哈哈哈哈！..他相信爱情");
            w.flush();  // 强制刷出缓冲区的数据
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try{
                w.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }

    }
}
