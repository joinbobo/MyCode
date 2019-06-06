package com.dingli.test.jdbc;

import com.dingli.test.jdbc.connection.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo11{
    public static void main(String[] args) {
        // 将ALlen的工资减 300给Smith

        // 从第一条语句开始到最后一条语句结束并提交称之为一个事务
        // 事务之间互不影响
        // 要么都成功，要么都失败
        // 一条以上的操作语句 称之为事务了
        Connection conn = null;
        PreparedStatement pst = null;
        String sql = "update emp set sal = sal - ? where ename = ?";
        int rs = 0;
        try {
            conn = JDBCUtil.getConnection();
            pst = conn.prepareStatement(sql);
            conn.setAutoCommit(false); //自动提交，默认是true

            pst.setDouble(1, 300);
            pst.setString(2, "ALLEN");
            pst.executeUpdate();

            pst.setDouble(1,-300);
            pst.setString(2,"SMITH");
            rs = pst.executeUpdate();

            conn.commit();
            // 因为设置了自动提交为false
            // 所以在这里需要手动提交代码
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                if(conn != null)
                    conn.rollback(); //出现异常，回滚数据
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            JDBCUtil.close(conn,pst,null);
        }
        System.out.println(rs);
    }
}
