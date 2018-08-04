package com.lti.sorting.demo;

import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee> {

	private int id;
	private String name;
	private int age;
	private int salary;

	public Employee(int id, String name, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee() {
		super();
		this.id = 0;
		this.name = "XXXXX";
		this.age = 0;
		this.salary = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if (o.getId() == this.id) {
			return 0;
		}

		else if (o.getId() > this.id) {
			return -1;
		}

		else {
			return 1;
		}

	}

	@Override
	public int compare(Employee o1, Employee o2) {

		if (o1.getSalary() > o2.getSalary())
			return 1;
		else if (o1.getSalary() < o2.getSalary())
			return -1;
		
		return 0;
	
	}

}
