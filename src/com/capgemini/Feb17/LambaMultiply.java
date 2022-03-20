package com.capgemini.Feb17;

import java.util.function.BiFunction;

public class LambaMultiply {
	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Integer> func = (x,y)->x*y;
		System.out.println("Multiply = "+func.apply(6, 4));
	}
}
