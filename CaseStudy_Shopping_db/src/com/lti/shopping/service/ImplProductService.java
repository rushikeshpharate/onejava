package com.lti.shopping.service;
import java.sql.SQLException;
import java.util.ArrayList;

import com.lti.shopping.dao.*;
import com.lti.shopping.entity.Product;

public class ImplProductService implements IProductService {

	private IProductDao DaoService;
	@Override
	public ArrayList<Product> getProductDetails() {
		// TODO Auto-generated method stub
		
		
		try {
			DaoService =new ProductDaoImpl();
			ArrayList<Product> productlist=DaoService.getProductDetails();
			return productlist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		

	}

	@Override
	public int addProductDetails(Product p1) {
		// TODO Auto-generated method stub
		try {
			DaoService =new ProductDaoImpl();
			return DaoService.addProductDetails(p1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
return 0;
	}

}
