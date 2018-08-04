package com.lti.shopping.services;

import java.util.ArrayList;

import com.lti.shopping.entity.Product;

public interface IProduct {

	ArrayList<Product> productAdd(Product p1);
	ArrayList<Product> productShowAll();
}
