package com.dingli.test.io;

import java.io.*;

public class Demo6 {
    public static void main(String[] args) {
        // 用FileOutputStream在D盘下创建一个文件tt.txt
        // 文件内容 a-z

        OutputStream os = null;
        try{
            os = new FileOutputStream("D:/tt.txt");
            for(int i = 97;i < 123; i++){
                os.write(i);
            }
            for(int i = 65; i < 91; i++){
                os.write(i);
            }

            String str = "\n天堂有路你不走，地狱无门你闯进来！";
            os.write(str.getBytes());

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                os.close(); // 使用完输入输出流必须关闭
            }catch(IOException e){
                e.printStackTrace();
            }
        }


    }
}
