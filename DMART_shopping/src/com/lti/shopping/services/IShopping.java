package com.lti.shopping.services;

public interface IShopping {
	
	void productAdd(int productId,String productName,float productCost);
	void productDelete(int productId);
	void productSearch(int productId);
	void productSearch(String productName);
	void productDisplay();
	

}
