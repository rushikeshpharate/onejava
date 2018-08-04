package com.lti.shopping.services;

import java.util.ArrayList;

import com.lti.shopping.entity.*;

public class ImplProduct implements IProduct {
	
	ArrayList<Product> myList=new ArrayList();

	@Override
	public ArrayList<Product> productAdd(Product p1) {
		
		myList.add(p1);
		
		return myList;
				
	}

	@Override
	public ArrayList<Product> productShowAll() {
		
		return myList;
	
	}
	
}
