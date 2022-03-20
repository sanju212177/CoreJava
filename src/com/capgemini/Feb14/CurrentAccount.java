package com.capgemini.Feb14;

public class CurrentAccount extends Account {
	public CurrentAccount(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	private double overdraftLimit;

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	@Override
	public void withdraw(double balance) {
		if(balance >= overdraftLimit) {
			System.out.println("Overdraft Limit reached.");
		}
		else {
			setBalance(getBalance()-balance);
		}
	}
}
