package com.dingli.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo1 {
    public static void main(String[] args) {
        try{
            //1.加载驱动（可省略）
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.建立连接
            String url = "jdbc:mysql://localhost:3306/mydatabase?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";
            String user = "test";
            String pass = "test";
            long time = System.currentTimeMillis();  //获取当前时间毫秒数
            Connection conn =
                    DriverManager.getConnection(url,user,pass);
            System.out.println("第一个链接创建的时间："
                    + (System.currentTimeMillis() - time));

            time = System.currentTimeMillis();
            Connection conn1 =
                    DriverManager.getConnection(url,user,pass);
            System.out.println("第二个链接创建的时间："
                    + (System.currentTimeMillis() - time));

            System.out.println(conn);
            //3.创建Statement对象
            //4.执行SQL语句
            //5.处理执行结果
            //6.关闭连接
        } catch(ClassNotFoundException e){

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
