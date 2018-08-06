package com.lti.jdbc.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicInsert {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:oracle:thin:@localhost:1521:XE";

		Connection conn = DriverManager.getConnection(url, "hr", "hr");

		PreparedStatement pstmt = null;

		if (conn != null) {
			System.out.println("Connected");
		}

		try {

			pstmt = conn.prepareStatement("Insert into Products values(?,?,? )");
			pstmt.setInt(1, 106);
			pstmt.setString(2, "Cover");
			pstmt.setFloat(3, 100);
			int i = pstmt.executeUpdate();
			System.out.println(i + " Record Added ");

			Scanner sc = new Scanner(System.in);
			System.out.println("Insert Id");
			int id = sc.nextInt();
			System.out.println("Enter product name: ");
			String name = sc.next();
			System.out.println("Enter cost: ");
			float cost = sc.nextFloat();
			sc.close();
			pstmt = conn.prepareStatement("Insert into Products values(?,?,? )");
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setFloat(3, cost);
			i = pstmt.executeUpdate();
			System.out.println(i + " Record Added ");
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
