package com.lti.oopsdemo.user;

import com.lti.oopsdemo.entity.PermanentEmp;
import com.lti.oopsdemo.entity.Person;

import day2.SalesEmp;

public class TestInheritance {
	public static void main(String[] args) {
		
		Person p=new Person();
		
		p.cal();
	
		PermanentEmp pe= new PermanentEmp(101,"Jay",30000);
		
		pe.cal();
		SalesEmp se=new SalesEmp(1,"aaa",20);
		se.cal();
		
	}

}
