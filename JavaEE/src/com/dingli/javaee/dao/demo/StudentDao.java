package com.dingli.javaee.dao.demo;

import com.dingli.javaee.bean.Student;
import com.dingli.javaee.jdbc.JDBCUtil;
import com.dingli.javaee.jdbc.ObjUtil;
import com.dingli.javaee.jdbc.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    // 插入
    public void insert(Student student,int num){
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = JDBCUtil.getConnection();
            conn.setAutoCommit(false);
            String sql = "insert into tab_student(`name`,`age`,`sex`,`favs`,`edu`,`desc`) " +
                    "values(?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);

            for(int i=0; i<num; i++){     //num设置批量添加多少数据
                pst.setString(1, student.getName());
                pst.setInt(2, student.getAge());
                pst.setInt(3, student.getSex());
                pst.setString(4, student.getFavs());
                pst.setInt(5, student.getEdu());
                pst.setString(6, student.getDesc());
                pst.addBatch();     // addBatch高效率插入
            }
            pst.executeBatch();
            conn.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn,pst,null);
        }
    }

    // 删除
    public void delete(long id) {
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = JDBCUtil.getConnection();
            conn.setAutoCommit(false);
            String sql = "delete from tab_student where id = ?;";
            pst = conn.prepareStatement(sql);

            pst.setLong(1, id);

            pst.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            JDBCUtil.close(conn, pst, null);
        }
    }

    // 修改
    public void update(Student student,long id) {
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = JDBCUtil.getConnection();
            conn.setAutoCommit(false);
            String sql = "update tab_student set `name` = ?,age = ?,sex = ?,favs = ?,edu = ?,`desc` = ? where id = ?";
            pst = conn.prepareStatement(sql);

            pst.setString(1, student.getName());
            pst.setInt(2, student.getAge());
            pst.setInt(3, student.getSex());
            pst.setString(4, student.getFavs());
            pst.setInt(5, student.getEdu());
            pst.setString(6, student.getDesc());
            pst.setLong(7, id);

            pst.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                conn.rollback(); // 数据回滚
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            JDBCUtil.close(conn, pst, null);
        }
    }

    // 查询
    public List<Student> query(String name, Integer start, Integer end) {
        String sql = new SQL() {{
            SELECT("s.*");
            FROM("tab_student s");
            if (name !=null) {
                WHERE("s.name like ?");
            }
            if (start != null) {
                WHERE("s.age >= ?");
            }
            if (end != null) {
                WHERE("s.age <= ?");
            }
        }}.toString();
        Connection conn = null;
        PreparedStatement psd = null;
        ResultSet rs = null;

        List<Student> list = new ArrayList<>();
        try {
            conn = JDBCUtil.getConnection();
            psd = conn.prepareStatement(sql);
            int index = 1;
            if (name != null) {
                psd.setString(index++, name);
            }
            if (start != null) {
                psd.setInt(index++, start);
            }
            if (end != null) {
                psd.setInt(index++,end);
            }

            rs = psd.executeQuery();
            while (rs.next()) {
                Student s = ObjUtil.getInstance(rs, Student.class);
                list.add(s);
            }
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn,psd,null);
            return list;
        }
    }


}
