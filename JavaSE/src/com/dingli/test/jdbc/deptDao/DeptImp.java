package com.dingli.test.jdbc.deptDao;

import com.dingli.test.jdbc.connection.JDBCUtil;
import com.dingli.test.jdbc.connection.ObjectUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DeptImp implements DeptDao{
    @Override
    public int insert(Dept dept) {
        Connection conn = null;
        PreparedStatement pst = null;
        int rs = 0;
        String sql = "insert into dept(deptno,dname,loc)" +
                "values(?,?,?)";

        try {
            conn = JDBCUtil.getConnection();
            pst = conn.prepareStatement(sql);
            pst.setInt(1, dept.getDeptno());
            pst.setString(2, dept.getDname());
            pst.setString(3, dept.getLoc());
            rs = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn,pst,null);
        }
        return rs;
    }

    @Override
    public int[] insert(List<Dept> list) {
        Connection conn = null;
        PreparedStatement pst = null;
        int[] rs = null;
        String sql = "insert into dept(deptno,dname,loc)" +
                "values(?,?,?)";
        try {
            conn = JDBCUtil.getConnection();
            pst = conn.prepareStatement(sql);

            for(Dept dept : list){
                pst.setInt(1, dept.getDeptno());
                pst.setString(2, dept.getDname());
                pst.setString(3, dept.getLoc());
                pst.addBatch();
            }
            rs = pst.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn,pst,null);
        }

        return rs;
    }

    @Override
    public int update(Dept dept) {
        Connection conn = null;
        PreparedStatement pst = null;
        int rs = 0;
        String sql = "update dept set deptno = ?, dname = ?, loc = ? where deptno = ?";

        try {
            conn = JDBCUtil.getConnection();
            pst = conn.prepareStatement(sql);

            pst.setInt(1, dept.getDeptno());
            pst.setString(2, dept.getDname());
            pst.setString(3, dept.getLoc());
            pst.setInt(4,dept.getDeptno());

            rs = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn,pst,null);
        }

        return rs;
    }

    @Override
    public int delete(int deptno) {
        Connection conn = null;
        PreparedStatement pst = null;
        int rs = 0;
        String sql = "delete from dept where deptno = ?";

        try {
            conn = JDBCUtil.getConnection();
            pst = conn.prepareStatement(sql);

            pst.setInt(1, deptno);
            rs = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn,pst,null);
        }
        return rs;
    }

    @Override
    public List<Dept> query() {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "select * from dept";

        try {
            conn = JDBCUtil.getConnection();
            pst = conn.prepareStatement(sql);

            while(rs.next()){
                Dept d = ObjectUtil.getInstance(rs,Dept.class);
                System.out.println(d);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn,pst,null);
        }

        return null;
    }

}
