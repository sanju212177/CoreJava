package com.capgemini.Feb14;

public class Account {
	private double balance;
	private long accNum;
	private Person accHolder;
	
	public void withdraw(double balance) {
		this.balance -= balance;
	}
	
	public void deposit(double balance) {
		this.balance += balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public Account(String name, int age) {
		super();
		this.balance = 500;
		this.accNum = (long) (Math.random()*100);
		this.accHolder = new Person(name,age);
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accNum=" + accNum + ", accHolder=" + accHolder + "]";
	}
}
