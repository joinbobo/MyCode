package com.dingli.test.jdbc;

import com.dingli.test.jdbc.connection.JDBCUtil;
import com.dingli.test.jdbc.connection.ObjectUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Demo7 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtil.getConnection();
            stat = conn.createStatement();
            rs = stat.executeQuery("SELECT * from emp");
            while (rs.next()){
                Emp emp = ObjectUtil.getInstance(rs,Emp.class);
                System.out.println(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(conn,stat,rs);
        }
    }
}
