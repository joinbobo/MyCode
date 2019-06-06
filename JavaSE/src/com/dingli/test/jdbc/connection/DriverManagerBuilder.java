package com.dingli.test.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverManagerBuilder
        extends AbsConnectionBuilder{

    @Override
    public Connection getConnection() throws SQLException {
        String url = PropertiesUtil.getProperty("jdbc.url");
        String user = PropertiesUtil.getProperty("jdbc.user");
        String pass = PropertiesUtil.getProperty("jdbc.pass");
        return DriverManager.getConnection(url,user,pass);
    }
}
