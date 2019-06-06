package com.dingli.test.jdbc;

import java.sql.*;

public class Demo2 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try{
            //1.加载驱动（可省略）
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.建立连接
            String url = "jdbc:mysql://localhost:3306/mydatabase?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";
            String user = "test";
            String pass = "test";

            conn = DriverManager.getConnection(url,user,pass);

            System.out.println(conn);

            //3.创建Statement对象
            stat = conn.createStatement();

            //4.执行SQL语句         --此处为执行的查询语句
            rs = stat.executeQuery("select * from emp");

            //5.处理执行结果
            while (rs.next()){  //注意和集合类的迭代器区分
                System.out.print(rs.getString(1)+"\t");
                System.out.print(rs.getString(2)+"\t");
                System.out.print(rs.getString(3)+"\t");
                System.out.print(rs.getString(4)+"\t");
                System.out.print(rs.getString(5)+"\t");
                System.out.print(rs.getString(6)+"\t");
                System.out.print(rs.getString(7)+"\t");
                System.out.println(rs.getString(8));
            }
            //6.关闭连接 （写在catch中）
        } catch(ClassNotFoundException e){

        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stat != null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
