package com.lti.basics.exception1;

public class ExceptionDemo {
	
	static void giveSalary(int Salary) throws SalaryException{
		if(Salary > 20000 && Salary < 50000) {
			System.out.println("Exception not thrown");
		}
		else throw new SalaryException(Salary);
	}
	public static void main(String[] args) throws SalaryException {
		giveSalary(21000);
	}

}
