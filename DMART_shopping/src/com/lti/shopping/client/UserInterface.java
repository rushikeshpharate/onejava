package com.lti.shopping.client;

import java.util.ArrayList;
import java.util.Scanner;

import com.lti.shopping.entity.Product;
import com.lti.shopping.services.*;
import com.lti.shopping.entity.*;
public class UserInterface {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int choice;
		String choice1;
		ArrayList<Product> myList = new ArrayList();
		IProduct service = new ImplProduct();

		do {
			System.out.println("****DMART product services****");
			System.out.println("1.Add product ");
			System.out.println("2.Display all product ");
			System.out.println("3.Search for a product ");
			System.out.println("4.Delete a product ");
			System.out.println("5.Exit ");

			System.out.println("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter productId: ");
				int pid=sc.nextInt();
				System.out.println("Enter product name: ");
				String pname=sc.next();
				System.out.println("Enter product cost: ");
				float pcost=sc.nextFloat();
				Product p1=new Product(pid, pname, pcost);
				myList=service.productAdd(p1);
				System.out.println("Product added successfully ");
				
				break;
				
			case 2:
				myList=service.productShowAll();
				System.out.println(myList);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.exit(0);
				break;
			default:System.out.println("Invalid case: ");
				break;
			}
			
			System.out.println("Do you want to continue?");
			choice1=sc.next();
			
			
		} while (choice1.compareTo("Y")==0 ||choice1.compareTo("y")==0);

		sc.close();
	}

}
