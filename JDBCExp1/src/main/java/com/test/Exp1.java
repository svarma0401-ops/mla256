package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exp1 {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/mladec";
		String user = "root";
		String pass = "root@39";
		
		//1. Load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Establish or connection object
		Connection con = DriverManager.getConnection(url,user,pass);
		
		//3.Create statement object
		Statement stmt = con.createStatement();
		
		//String sql = "insert into book1 values(1,'Java',250)";
		
//		stmt.addBatch("insert into book1 values(2,'Spring',300)");
//		stmt.addBatch("insert into book1 values(3,'Angular',350)");
//		stmt.addBatch("insert into book1 values(4,'React',400)");
//		stmt.addBatch("insert into book1 values(5,'Python',450)");
//		stmt.addBatch("delete from book1 where b_id = 3");
//		stmt.addBatch("Update book1 set b_name = 'Angular' where b_id=4");
		
		String sql = "select * from book1";
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next())
		{
			System.out.println("ID: "+rs.getInt(1) + ", Name: " +rs.getString(2)+ ", Price: "+rs.getInt(3));
		}
		
		//4. Execute query
		//stmt.execute(sql);
		//stmt.executeBatch();
		//5. Close the connection object
		con.close();
		System.out.println("Done.");
	}

}
