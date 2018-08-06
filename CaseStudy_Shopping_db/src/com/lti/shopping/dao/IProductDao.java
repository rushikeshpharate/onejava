package com.lti.shopping.dao;

 import java.util.ArrayList;

 import com.lti.shopping.entity.Product;

public interface IProductDao {
	abstract ArrayList<Product> getProductDetails();
	abstract int addProductDetails(Product p1);

}
