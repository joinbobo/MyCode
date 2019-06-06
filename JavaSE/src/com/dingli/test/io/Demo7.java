package com.dingli.test.io;

import java.io.*;

public class Demo7 {
    public static void main(String[] args) {
        InputStream is = null;
        try {
            is = new FileInputStream("D:/tt.txt");
            byte[] b = new byte[1024];
            int len = -1;
            while((len = is.read(b)) != -1){
                System.out.println(new String(b,0,len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
