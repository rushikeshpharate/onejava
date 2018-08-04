package com.lti.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDemo1 {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		Connection conn=DriverManager.getConnection(url,"hr","hr");
		
		if(conn!=null) {
			System.out.println("Connected");
		}

	}

}
