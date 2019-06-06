package com.dingli.test.jdbc;

import com.dingli.test.jdbc.connection.JDBCUtil;
import com.dingli.test.jdbc.connection.ObjectUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo8 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtil.getConnection();
            stat = conn.createStatement();
            rs = stat.executeQuery("select *,birthday my_birthday from tab_student");
            while(rs.next()){
                Student stu = ObjectUtil.getInstance(rs,Student.class);
                System.out.println(stu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            JDBCUtil.close(conn,stat,rs);
        }


    }
}
