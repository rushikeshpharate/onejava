package com.lti.basics.bank;

public class TestApp {

	public static void main(String[] args) {
		
		System.out.println("Main method of TestApp");
		SavingsAccount acc = new SavingsAccount(101,"Aniruddha",1000);
		System.out.println(acc.toString());
		try {
			acc.withdraw(3000);
		}
		catch(LowBalanceException e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
