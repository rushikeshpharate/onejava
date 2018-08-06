package com.lti.shopping.service;

 import java.util.ArrayList;

 import com.lti.shopping.entity.Product;

public interface IProductService {
	abstract ArrayList<Product> getProductDetails();
	abstract int addProductDetails(Product p1);

}
