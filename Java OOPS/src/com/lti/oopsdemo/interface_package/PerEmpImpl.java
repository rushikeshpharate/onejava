package com.lti.oopsdemo.interface_package;

public class PerEmpImpl implements IPerson {

	@Override
	public void calc() {
		
		System.out.println("inside Permanent employee");
		
	}
	
	int basicSal;
	int empId;
	double saPerDay;
	
	
	

	public PerEmpImpl(int basicSal, int empId, double saPerDay) {
		super();
		this.basicSal = basicSal;
		this.empId = empId;
		this.saPerDay = saPerDay;
	}


	@Override
	public String toString() {
		return "PerEmpImpl [basicSal=" + basicSal + ", empId=" + empId + ", saPerDay=" + saPerDay + "]";
	}
	
	
	
	

}
