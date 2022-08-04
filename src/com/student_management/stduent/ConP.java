package com.student_management.stduent;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConP {
static Connection  con;
	
	public static Connection createC() {
		/*Five Steps to create a connection */
		try {
			
			// 1. load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. create a connection
			String user = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/students_manage";
			con = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
