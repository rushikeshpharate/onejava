package com.lti.basics.bank;

public class Account {
	private int accountId;
	private String name;
	int bal;
	private String bankName;
	
	
	public Account(int accountId, String name, int bal) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.bal = bal;
		this.bankName = "Axis Bank";
	}


	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name + ", bal=" + bal + ", bankName=" + bankName + "]";
	}
	
	
	

}
