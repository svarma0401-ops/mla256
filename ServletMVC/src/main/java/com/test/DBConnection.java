package com.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private static Connection con = null;
	
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/mladec";
	private static String user = "root";
	private static String pass = "root@39";
	
	static {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,pass);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getCon() {
		return con;
	}
}
