package com.lti.oopsdemo.interface_package;

public class TestInterface {
	public static void main(String[] args) {
		
		PerEmpImpl pe=new PerEmpImpl(10000, 1, 300);
	
		pe.calc();
		
		TempEmpImpl te=new TempEmpImpl(50, 500, 30);
		te.calc();
		
		IPerson P_ref = new PerEmpImpl(10000, 1, 300);
//		P_ref = pe;
		P_ref.calc();
		
	}

	
}
