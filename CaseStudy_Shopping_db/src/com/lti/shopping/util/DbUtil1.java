package com.lti.shopping.util;

import java.sql.*;
import oracle.jdbc.pool.OracleDataSource;

public class DbUtil1 {
	
	private OracleDataSource dataSource;
	
	public DbUtil1() throws SQLException{
		
		dataSource =new OracleDataSource();
		
		String url ="jdbc:oracle:thin:@localhost:1521:XE",username ="hr",password = "hr";
		
		dataSource.setURL(url);
		dataSource.setUser(username);
		dataSource.setPassword(password);
	}

	public Connection getConnectionFromPool() throws SQLException{
		
		return dataSource.getConnection();
	}

}

