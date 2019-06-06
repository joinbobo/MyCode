package com.dingli.test.io;

import java.io.*;

public class Demo12 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // InputStreamReader 就是转换流
        // 把字节流转换为对应的字符流
        // 转换本身是字符流
        Writer w = null;
        BufferedWriter bw = null;

        try {
            String str = null;
            w = new FileWriter("D:/test.java");
            bw = new BufferedWriter(w);
            do{
                str = br.readLine();
                // readLine是阻塞式的方法
                // 遇到换行或回车才会执行
                if("ESC".equals(str)){
            break;
        }
        bw.write(str);
        bw.newLine(); //换行
        bw.flush();
    }while(true);
} catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (br != null) {
                try{
                    br.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(bw != null){
                try{
                    bw.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

}
