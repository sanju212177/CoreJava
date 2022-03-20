package com.capgemini.oops;


public class TestConstructorDemo {
	
	public static void main(String[] args) {
		
		ConstructorDemo demo1= new ConstructorDemo(3,5,7);
		ConstructorDemo demo2= new ConstructorDemo(12,15);
		ConstructorDemo demo3= new ConstructorDemo(25);
		
		System.out.println(demo1);
		System.out.println(demo2);
		System.out.println(demo3);
	}
}
