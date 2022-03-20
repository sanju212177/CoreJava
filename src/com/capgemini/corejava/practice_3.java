package com.capgemini.corejava;

public class practice_3 {
	public static void main(String[] args ) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if(args[2].equals("+")) {
			int res = a + b;
			System.out.println("Sum = " + res);
		}
		else if(args[2].equals("-")) {
			int res = a - b;
			System.out.println("Sub = " + res);
		}
		else if(args[2].equals("*")) {
			int res = a * b;
			System.out.println("Mul = " + res);
		}
		else if(args[2].equals("/")) {
			double res = a / (b*1.0);
			System.out.println("Div = " + res);
		}
		else {
			System.out.println("Wrong operator");
		}
	}

}
