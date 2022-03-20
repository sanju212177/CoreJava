package com.capgemini.Feb14;

public class SavingsAccount extends Account {
	public SavingsAccount(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	final double minimumBalance = 500;
	
	@Override
	public void withdraw(double balance) {
		if((getBalance()-balance)>minimumBalance) {
			setBalance(getBalance()-balance);
		}
		else {
			System.out.println("Cannot Withdraw.");
		}
	}
	
}
