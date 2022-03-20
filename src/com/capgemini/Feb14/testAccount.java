package com.capgemini.Feb14;
//import java.util.*;

public class testAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Account a1 = new Account("Smith",32);
		a1.setBalance(2000);
		a1.deposit(2000);
		System.out.println(a1);
		
		Account a2 = new Account("Kathy",28);
		a2.setBalance(3000);
		a2.withdraw(2000);
		System.out.println(a2);
		
		SavingsAccount s = new SavingsAccount("jake",24);
		s.setBalance(2500);
		s.withdraw(1400);
		System.out.println(s);
		
		CurrentAccount c = new CurrentAccount("jenny",54);
		c.setBalance(4000);
		c.setOverdraftLimit(2000);
		c.withdraw(1200);
		System.out.println(c);
	}

}
