package com.lti.oopsdemo.entity;


public class Person {
	
	int ID;
	String name;
	

	
	public Person() {
		super();
	}

	public Person(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Person [ID=" + ID + ", name=" + name + "]";
	}

	public void cal()
	{
		System.out.println("Person parent class");
	}

}
