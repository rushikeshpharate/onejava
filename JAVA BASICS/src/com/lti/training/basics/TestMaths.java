package com.lti.training.basics;

import java.util.Scanner;

public class TestMaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number :");
		x=sc.nextInt();
		System.out.println("Enter second number :");
		y=sc.nextInt();
		Maths m=new Maths();
		res=m.doSum(x,y);
		System.out.println("Result is: " +res);
		sc.close();
	}

}
