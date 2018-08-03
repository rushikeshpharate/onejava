package com.lti.basics.bank;

public class SavingsAccount extends Account {
	
	public SavingsAccount(int accountId, String name, int bal) {
		super(accountId, name,bal);
	}
	
	public void withdraw(int amount) throws LowBalanceException{
		if(bal<amount) {
			throw new LowBalanceException("Balance is Low");
		}
		else {
			bal = bal-amount;
			System.out.println("Your remaining balance is : "+bal);
		}
			
	}
	
}
