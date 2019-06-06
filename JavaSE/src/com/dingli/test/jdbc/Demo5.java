package com.dingli.test.jdbc;

import com.dingli.test.jdbc.connection.JDBCUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Demo5 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtil.getConnection();
            stat = conn.createStatement();
            rs = stat.executeQuery("SELECT * from emp");
            List<Emp> list = new ArrayList<>();
            while (rs.next()){
                Emp emp = new Emp();
                emp.setEmpno(rs.getInt("empno"));
                emp.setEname(rs.getString("ename"));
                emp.setJob(rs.getString("job"));
                emp.setMgr(rs.getInt("mgr"));
                emp.setHiredate(rs.getDate("hiredate"));
                emp.setSal(rs.getDouble("sal"));
                emp.setComm(rs.getDouble("comm"));
                emp.setDeptno(rs.getInt("deptno"));
                list.add(emp);
            }
            System.out.println(list);
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
