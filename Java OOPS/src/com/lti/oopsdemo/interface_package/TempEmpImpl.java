package com.lti.oopsdemo.interface_package;

public class TempEmpImpl implements IPerson {
	
	int tempId;
	double salPerDay;
	int noDays;

	@Override
	public void calc() {
		
		double totalSal=salPerDay*noDays;
		System.out.println("Total Salary: "+totalSal);
	
	}

	public TempEmpImpl(int tempId, double salPerDay, int noDays) {
		super();
		this.tempId = tempId;
		this.salPerDay = salPerDay;
		this.noDays = noDays;
	}

	
}
