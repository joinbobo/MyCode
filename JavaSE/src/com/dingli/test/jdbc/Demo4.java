package com.dingli.test.jdbc;

import com.dingli.test.jdbc.connection.JDBCUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo4 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtil.getConnection();
            stat = conn.createStatement();
            rs = stat.executeQuery("SELECT * from emp");
            while (rs.next()){
                Emp p = new Emp();

                System.out.print(rs.getInt("empno")+"\t");
                System.out.print(rs.getString("ename")+"\t");
                System.out.print(rs.getString("job")+"\t");
                System.out.print(rs.getInt("mgr")+"\t");
                System.out.print(rs.getDate("hiredate")+"\t");
                System.out.print(rs.getDouble("sal")+"\t");
                System.out.print(rs.getDouble("comm")+"\t");
                System.out.println(rs.getInt("deptno"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stat != null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
