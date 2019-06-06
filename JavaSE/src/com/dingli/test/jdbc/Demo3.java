package com.dingli.test.jdbc;

import com.dingli.test.jdbc.connection.JDBCUtil;


import java.sql.*;

public class Demo3 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtil.getConnection();
            stat = conn.createStatement();
            rs = stat.executeQuery("SELECT * from emp");
            while (rs.next()){
                System.out.print(rs.getString(1)+"\t");
                System.out.print(rs.getString(2)+"\t");
                System.out.print(rs.getString(3)+"\t");
                System.out.print(rs.getString(4)+"\t");
                System.out.print(rs.getString(5)+"\t");
                System.out.print(rs.getString(6)+"\t");
                System.out.print(rs.getString(7)+"\t");
                System.out.println(rs.getString(8));
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
