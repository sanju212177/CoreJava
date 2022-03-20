package com.capgemini.Feb16;

public class Car extends Vehicle{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName()+" drive.");
	}
	
}
