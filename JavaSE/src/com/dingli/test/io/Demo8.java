package com.dingli.test.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Demo8 {
    public static void main(String[] args) {
        Reader r = null;
        try{
            r = new FileReader("D:/tt.txt");
            char[] c = new char[8];
            int len = -1;
            while((len = r.read(c)) != -1){
                System.out.println(new String(c,0,len));
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
