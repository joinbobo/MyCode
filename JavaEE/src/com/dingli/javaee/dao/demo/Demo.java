package com.dingli.javaee.dao.demo;

import com.dingli.javaee.bean.Student;

public class Demo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        Student s = new Student();

        s.setName("批量");
        s.setAge(22);
        s.setSex(1);
        s.setFavs("1,2");
        s.setEdu(4);
        s.setDesc("天气真好");
//        studentDao.insert(s,5); // 参数num为批量多少条
//
//        studentDao.delete(88);  // 参数id为删除id
//
//        studentDao.update(s,80); // 参数id为修改id

//        System.out.println(studentDao.query("雷茂林",10,50));
        System.out.print(studentDao.query(null,null,null));

    }
}
