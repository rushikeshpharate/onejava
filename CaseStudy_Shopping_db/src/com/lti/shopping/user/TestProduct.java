package com.lti.shopping.user;

import java.util.ArrayList;
import java.util.Scanner;

import com.lti.shopping.entity.Product;
import com.lti.shopping.service.IProductService;
import com.lti.shopping.service.ImplProductService;

public class TestProduct {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ans = " ";
		int no;
		
		int id;
		String name;
		float cost;
		
		do {
			System.out.println("****Oracle database services****");
			System.out.println("1.Show all product");
			System.out.println("2.Add a product");

			System.out.println("Enter Choice");
			no = sc.nextInt();

			switch (no) {

			case 1:
				
				IProductService productservice=new ImplProductService();
				ArrayList<Product> productList=productservice.getProductDetails();
				System.out.println(productList);
				for(Product p:productList) {
					System.out.println(p);
				}
				
				break;
			case 2:
				
				productservice=new ImplProductService();
				System.out.println("Enter id");
				id = sc.nextInt();
				System.out.println("Enter Product name");
				name = sc.next();
				name="'"+name+"'";
				System.out.println("Enter Cost");
				cost = sc.nextFloat();
				Product p1=new Product(id,name,cost);
				productservice.addProductDetails(p1);
				break;

			default:
				System.out.println("Invalid");
				break;

			}

			System.out.println("Press Y/y to continue:- ");
			ans = sc.next();
		} while (ans.compareTo("Y") == 0 || ans.compareTo("y") == 0);

		sc.close();
	}

}
