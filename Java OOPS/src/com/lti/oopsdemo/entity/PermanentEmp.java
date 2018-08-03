package com.lti.oopsdemo.entity;

public class PermanentEmp extends Person
{

		public int sal;

		public int getSal() {
			return sal;
		}

		public void setSal(int sal) {
			this.sal = sal;
		}

		public PermanentEmp() {
			super();
			// TODO Auto-generated constructor stub
		}

		public PermanentEmp(int sal) {
			super();
			this.sal = sal;
		}

		public PermanentEmp(int iD, String name,int sal) {
			super(iD, name);
			
			this.sal = sal;
			
		}

		
		public void cal()
		{
			System.out.println("Inside PermanentEmp child class");
		}
		
		
	

}
