package com.dingli.test.jdbc.dao;

import com.dingli.test.jdbc.Emp;
import com.dingli.test.jdbc.connection.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpDAOImpl implements EmpDAO{

    // 添加数据
    @Override
    public int insert(Emp emp) {
        Connection conn = null;
        PreparedStatement pst = null;
        int rs = 0;
        String sql="INSERT INTO emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) "+
                "VALUES (?,?,?,?,?,?,?,?)";
        try {
            conn = JDBCUtil.getConnection();
            pst = conn.prepareStatement(sql);
            pst.setLong(1, emp.getEmpno());
            pst.setString(2, emp.getEname());
            pst.setString(3, emp.getJob());
            pst.setLong(4,emp. getMgr());
            pst.setDate(5,new java.sql.Date(emp.getHiredate().getTime()));
            pst.setDouble(6, emp.getSal());
            pst.setDouble(7, emp.getComm());
            pst.setLong(8, emp.getDeptno());

            rs = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn,pst,null);
        }
        return rs;

    }

    // 批量添加数据
    @Override
    public int[] insert(List<Emp> list) {
        Connection conn = null;
        PreparedStatement pst = null;
        int[] rs = null;
        try {
            conn = JDBCUtil.getConnection();
            String sql="INSERT INTO emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) "+
                    "VALUES (?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);

            for(Emp emp : list){
                pst.setLong(1, emp.getEmpno());
                pst.setString(2, emp.getEname());
                pst.setString(3, emp.getJob());
                pst.setLong(4, emp.getMgr());
                pst.setDate(5,new java.sql.Date(emp.getHiredate().getTime()));
                pst.setDouble(6, emp.getSal());
                pst.setDouble(7, emp.getComm());
                pst.setLong(8, emp.getDeptno());
                pst.addBatch();
                // 将参数设置好后 添加到批量执行的代码中等待执行
            }
            rs = pst.executeBatch(); //执行addBatch 批量添加的
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn,pst,null);
        }
        return rs;
        // 表示int 数组 每一条SQL语句插入数据成功的条数
    }

    // 更新表中数据
    @Override
    public int update(Emp emp) {

        Connection conn = null;
        PreparedStatement pst = null;
        int rs = 0;
        try {
            conn = JDBCUtil.getConnection();
            String sql = "UPDATE emp set ename = ?,job = ?,mgr = ?,hiredate = ?,sal = ?,comm = ?,deptno = ? where empno = ?";

            pst = conn.prepareStatement(sql);
            pst.setString(1, emp.getEname());
            pst.setString(2, emp.getJob());
            pst.setLong(3, emp.getMgr());
            pst.setDate(4,new java.sql.Date(emp.getHiredate().getTime()));
            pst.setDouble(5, emp.getSal());
            pst.setDouble(6, emp.getComm());
            pst.setLong(7, emp.getDeptno());
            pst.setLong(8, emp.getEmpno());

            rs = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn,pst,null);
        }
        return rs;
    }

    // 删除
    @Override
    public int delete(long empno) {
        Connection conn = null;
        PreparedStatement pst = null;
        int rs = 0;
        String sql="DELETE from emp WHERE empno=?";
        try {
            conn = JDBCUtil.getConnection();
            pst = conn.prepareStatement(sql);
            pst.setLong(1,empno);
            rs = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn,pst,null);
        }
        return rs;
    }

    @Override
    public List<Emp> query() {
//        Connection conn = null;
//        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Emp> list1 = new ArrayList<>();
//        try {
//            conn = JDBCUtil.getConnection();
//            String sql = ("SELECT * FROM emp");
//            pst = conn.prepareStatement(sql);
//            ResultSet crs = pst.executeQuery();
//            List<Emp> list = new ArrayList<>();
//            while (rs.next()){
//                Emp emp = new Emp();
//                emp.setEname(rs.getString("ename"));
//                emp.setJob(rs.getString("job"));
//                emp.setMgr(rs.getInt("mgr"));
//                emp.setHiredate(rs.getDate("hiredate"));
//                emp.setSal(rs.getDouble("sal"));
//                emp.setComm(rs.getDouble("comm"));
//                emp.setDeptno(rs.getInt("deptno"));
//                list1.add(emp);
//            }
//            Iterator<Emp> iter=list1.iterator();
//            while (iter.hasNext()){
//                System.out.println(iter.next());
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            JDBCUtil.close(conn,stat,rs);
//        }
        return list1;
    }

}
