package com.lti.oops.basics;

public class Student {
	
	int stuId;
	String stuName;
	float stuFees;
	
	
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public float getStuFees() {
		return stuFees;
	}
	public void setStuFees(float stuFees) {
		this.stuFees = stuFees;
	}
	@Override
	public String toString() {
		return " Student \n stuId=" + stuId + "\n stuName=" + stuName + "\n stuFees=" + stuFees;
	}
	

}
