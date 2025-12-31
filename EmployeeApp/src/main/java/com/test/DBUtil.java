package com.test;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

    private static final String url ="jdbc:mysql://localhost:3306/employee_app";
    private static final String user = "root";
    private static final String pass = "root@39";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            throw new RuntimeException("Database Connection Failed");
        }
    }
}
