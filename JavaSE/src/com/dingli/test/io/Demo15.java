package com.dingli.test.io;

import com.dingli.test.object.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo15 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("D:/object.txt");
            ois = new ObjectInputStream(fis);

            Student s = (Student) ois.readObject();
            // 也可 Object s = ois.readObject();
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
