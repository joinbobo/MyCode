package com.dingli.test.io;

import java.io.*;

//public class Demo11 {
//    public static void main(String[] args) {
//        try{
//            //写入数据
//            FileOutputStream f = new FileOutputStream("Hello.txt");
//            DataOutputStream d = new DataOutputStream(f);
//            d.writeLong(1000L);
//            d.close();
//
//            //读取数据
//            FileInputStream fs = new FileInputStream("Hello.txt");
//            DataInputStream ds = new DataInputStream(fs);
//            System.out.println(ds.readLong());
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//    }
//    public static void exist(String filePath) {
//
//    }
//        public static void notExist(String filePath){
//
//
//            File f = new File("D:/test.dat");
//            if (f.exists()) {
//
//            } else {
//                //如果文件存在，则往该文件写入一个
//                OutputStream os = null;
//                DataOutputStream dos = null;
//                try {
//                    os = new FileOutputStream(filePath);
//                    dos = new DataOutputStream(os);
//                    dos.writeLong(10000L);
//                } catch (FileNotFoundException e) {
//
//                }
//            }
//        }
//
//    }
//
//}
