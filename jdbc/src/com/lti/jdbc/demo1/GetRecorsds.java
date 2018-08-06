package com.lti.jdbc.demo1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetRecorsds {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:oracle:thin:@localhost:1521:XE";

		Connection conn = DriverManager.getConnection(url, "hr", "hr");

		if (conn != null) {
			System.out.println("Connected");
		}

		try {

			Statement stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from Products");

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				float cost = rs.getFloat(3);
				System.out.println("\t" + id + " " + name + "\t" + cost + "\n");
			}

		}

		catch (Exception e) {
			System.out.println(e);
		} finally {

			try {

				conn.close();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
