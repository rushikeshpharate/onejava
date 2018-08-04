package com.lti.training.basics;

import java.util.Scanner;

public class FirstProgram  
{

	public static void main(String[] args) 
	{
		System.out.println("Add two numbers:");
		int number1,number2,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		number1=sc.nextInt();
		System.out.println("Enter second1 number:");
		number2=sc.nextInt();
		result=number1+number2;
		System.out.println("Addition of "+number1 + " and " + number2 + " is: "+result);
	}
}
