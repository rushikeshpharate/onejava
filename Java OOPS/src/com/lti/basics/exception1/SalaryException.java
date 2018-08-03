package com.lti.basics.exception1;

public class SalaryException extends Exception {
	private int Salary;

	public SalaryException(int salary) {
		super();
		Salary = salary;
	}
	
	@Override
	public String toString() {
		return "Salary: "+Salary;
	}
	

}
