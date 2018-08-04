package com.lti.sorting.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class App {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		List<Employee> list_emp = new ArrayList();

		Employee emp_Jay = new Employee(101, "Jay", 28, 40000);
		list_emp.add(emp_Jay);

		Employee emp_Vijay = new Employee(102, "Vijay", 25, 50000);
		list_emp.add(emp_Vijay);
		
		Employee emp_Sujay = new Employee(103, "Sujay", 29, 30000);
		list_emp.add(emp_Sujay);

		System.out.println("Before Sorting: ");
		System.out.println(list_emp);
		
		Collections.sort(list_emp);
		System.out.println("After Sorting: ");
		System.out.println(list_emp);
		
		System.out.println("Before Sorting: ");
		System.out.println(list_emp);
		
		
		Collections.sort(list_emp, new Employee());
		System.out.println("After Sorting: ");
		System.out.println(list_emp);
		
	}

}
