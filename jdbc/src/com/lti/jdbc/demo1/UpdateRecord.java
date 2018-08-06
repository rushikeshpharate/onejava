package com.lti.jdbc.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:oracle:thin:@localhost:1521:XE";

		Connection conn = DriverManager.getConnection(url, "hr", "hr");

		PreparedStatement pstmt = null;

		if (conn != null) {
			System.out.println("Connected");
		}

		try {

			pstmt = conn.prepareStatement("Update Products set PrdCost=? where PrdId=?");
			pstmt.setFloat(1, 100);
			pstmt.setInt(2, 103);

			int i = pstmt.executeUpdate();
			System.out.println(i + " Record Updated ");

			Statement s = conn.createStatement();
			//String sql = "Select * from Products where PrdId=" + 103 + "";
			String sql = "Select * from Products";
			ResultSet rs = s.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				float cost = rs.getFloat(3);
				System.out.println("Id:" + id + "\tName:" + name + "\tCost:" + cost );
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
