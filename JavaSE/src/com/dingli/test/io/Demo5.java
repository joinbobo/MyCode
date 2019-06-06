package com.dingli.test.io;

import java.io.*;

public class Demo5 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try{
            is = new FileInputStream("D:\\aaaa.docx");
            os = new FileOutputStream("D:\\bbbb.docx");
            int b = 0;
            while((b = is.read()) != -1){
                os.write(b);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                is.close();
            }catch(IOException e){
                e.printStackTrace();
            }
            try{
                os.close(); // 使用完输入输出流必须关闭
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
