package com.dingli.test.io;


import java.io.*;

public class Demo18 {
    public static void main(String[] args) throws Exception {
        Place1 pp1 = new Place1 ("四川省","成都市","龙泉驿");
        Person1 p1 = new Person1("张三",22,pp1);
        System.out.println(p1);

        // 用IO实现深克隆
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(p1);
        oos.flush();

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        Person1 p2 = (Person1) ois.readObject();
        ois.close();
        p2.getPlace().setCity("绵羊");

        System.out.println(p1);
        System.out.println(p2);
    }
}
