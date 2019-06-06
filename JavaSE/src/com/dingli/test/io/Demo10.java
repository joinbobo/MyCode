package com.dingli.test.io;

import java.io.*;

public class Demo10 {
    public static void main(String[] args) {
        try{
            FileOutputStream fs = new FileOutputStream("word.txt");
            DataOutputStream ds = new DataOutputStream(fs);
            ds.writeUTF("使用writeUTF()方法写入数据\n");
            ds.writeDouble(19.8);
            ds.writeInt(298);
            ds.writeBoolean(true);
            ds.close();
            FileInputStream fis = new FileInputStream("word.txt");
            DataInputStream dis = new DataInputStream(fis);
            System.out.printf(dis.readUTF());
            System.out.println(dis.readDouble());
            System.out.println(dis.readInt());
            System.out.println(dis.readBoolean());
        }catch(IOException e){
            e.printStackTrace();
        }



    }
}
