package com.dingli.test.io;

import com.dingli.test.object.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
// Demo14-Demo15
public class Demo14 {
    public static void main(String[] args) {
        // 对象输入输出
        ObjectOutputStream oos = null;
        FileOutputStream fos = null;
        // 对象序列化就是把一个对象变为二进制数据流的一种方法。
        // 反序列就是将序列化好的二进制流数据，转换回对象
        // 序列化对象必须实现 Serializable 标示性接口
        try {
            fos = new FileOutputStream("D:/object.txt");
            oos = new ObjectOutputStream(fos);

            oos.writeObject(new Student("张三",22,100));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
