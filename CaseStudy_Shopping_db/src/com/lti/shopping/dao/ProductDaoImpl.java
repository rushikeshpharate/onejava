package com.lti.shopping.dao;

import java.sql.*;
import java.util.ArrayList;

import com.lti.shopping.entity.Product;
import com.lti.shopping.util.DbUtil1;
// import java.util.ArrayList;

import com.lti.shopping.entity.Product;

public class ProductDaoImpl implements IProductDao {
	DbUtil1 util;

	public ProductDaoImpl() throws SQLException {
		util = new DbUtil1();
	}

	@Override
	public ArrayList<Product> getProductDetails() {

		Connection conn = null;
		ResultSet rs = null;

		ArrayList<Product> productlist = new ArrayList<>();

		try {
			conn = util.getConnectionFromPool();

			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery("Select * from products");

			while (rs.next()) {

				int id = rs.getInt("PrdId");
				String name = rs.getString("PrdName");
				float cost = rs.getFloat("PrdCost");
				// System.out.println("Id :- " + id + "\tName :- " + name + "\tCost :- " +
				// cost);
				Product p = new Product(id, name, cost);
				productlist.add(p);
			}
			return productlist;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;

		// return null;
	}

	@Override
	public int addProductDetails(Product p1) {
		// TODO Auto-generated method stub
		Connection conn = null;
		ResultSet rs = null;
		int id=p1.getPid();
		String name=p1.getPname();
		float cost=(float) p1.getPrice();
		try {
			conn = util.getConnectionFromPool();
			Statement stmt = (Statement) conn.createStatement();
			
			System.out.println(" "+id+" "+name+" "+cost);
			String query="Insert into Products values("+id+","+name+","+cost+")";
			int i = stmt.executeUpdate(query);

			System.out.println(i+ " record inserted");

		} catch (Exception e) {
			System.out.println(e);
		}
		return id;

	}

}
