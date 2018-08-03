package com.lti.basics.exceptions;
import java.util.Scanner;

public class Salary{
	public static void main(String[] args) throws CustomException {
		
	String designation;
	double salary = 0;
	double hra;
	double ta;
	double taxReduction;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Designation: ");
	designation = sc.next();
	
	switch(designation) {
	case "Manager": System.out.println("Enter salary");
					salary =sc.nextDouble();
					if(salary < 5000)
					{
						throw new CustomException("Salary less than 5000");
					}
					ta = 0.05*salary;
					hra = 0.10*salary;
					taxReduction = 0.1*salary;
					salary = salary+ta+hra-taxReduction;
					break;
					
	case "Analyst": System.out.println("Enter salary");
					salary =sc.nextDouble();
					if(salary < 5000)
					{
						throw new CustomException("Salary less than 5000");
					}
					ta = 0.05*salary;
					hra = 0.10*salary;
					taxReduction = 0.1*salary;
					salary = salary+ta+hra-taxReduction;
					break;
					
	default       : System.out.println("Salary and Designation Not Found");
					break;
	}
	
	System.out.println("Designation: "+designation);
	System.out.println("Salary: "+salary);
	}
}
