package com.dingli.javaee.dao.demo;

import com.dingli.javaee.jdbc.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentCreate {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = JDBCUtil.getConnection();
            String sql = "CREATE TABLE `tab_student` (\n" +
                    "  `id` bigint(20) NOT NULL AUTO_INCREMENT,\n" +
                    "  `name` varchar(255) NOT NULL COMMENT '姓名',\n" +
                    "  `age` int(11) NOT NULL COMMENT '年龄',\n" +
                    "  `sex` int(11) NOT NULL COMMENT '性别',\n" +
                    "  `favs` varchar(255) NOT NULL COMMENT '爱好',\n" +
                    "  `edu` int(11) NOT NULL COMMENT '学历',\n" +
                    "  `desc` varchar(255) NOT NULL COMMENT '自我介绍',\n" +
                    "  PRIMARY KEY (`id`)\n" +
                    ") ENGINE=InnoDB AUTO_INCREMENT=74 DEFAULT CHARSET=utf8mb4;\n";
            pst = conn.prepareStatement(sql);

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
