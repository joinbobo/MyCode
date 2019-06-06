package com.dingli.test.jdbc;

import com.dingli.test.jdbc.connection.JDBCUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo6 {
    /**
     * 为emp插入数据
     * String str = "
     * stat.excuteUpdate(str)
     */

    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtil.getConnection();
            stat = conn.createStatement();

            String str = "INSERT INTO mydatabase.emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) " +
                    "VALUES (6666, LEIMAOL, CLERK, 790z, 1980-12-17 00:00:00, 800.00, 0.00, 20)";
            stat.executeUpdate(str);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
