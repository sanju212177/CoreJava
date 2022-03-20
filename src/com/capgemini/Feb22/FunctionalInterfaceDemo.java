package com.capgemini.Feb22;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		//BiConsumer<T,U> Demo
		BiConsumer<Integer,Integer> biconsumer = (a,b) -> System.out.println(a>b);
		biconsumer.accept(5, 7);
		System.out.println("----------------------------");
		
		//BiFunction<T,U,R> Demo
		BiFunction<Integer,Integer,Boolean> bifunction = (a,b) -> a>b;
		System.out.println(bifunction.apply(5, 7));
		System.out.println("----------------------------");
		
		//BinaryOperator<T> Demo
		BinaryOperator<String> binaryoperator = (a,b) -> a + b;
		String res = binaryoperator.apply("123", "567");
		System.out.println(res);
		System.out.println("----------------------------");
		
		//BiPredicate<T,U> demo
		BiPredicate<String,String> bipredicate = (a,b) -> a.equalsIgnoreCase(b);
		System.out.println(bipredicate.test("abcd", "ABCD"));
		System.out.println("----------------------------");
		
		//Consumer<T,U> Demo
		Consumer<Integer> consumer = (a) -> System.out.println(++a);
		consumer.accept(5);
		System.out.println("----------------------------");
		
		//DoubleBinaryOperator demo
		DoubleBinaryOperator doublebinaryoperator = (a,b)->a*b;
		System.out.println(doublebinaryoperator.applyAsDouble(50.0, 4.5));
		System.out.println("----------------------------");
		
		//DoubleConsumer
		DoubleConsumer doubleconsumer = (a)->System.out.println(a/10);
		doubleconsumer.accept(54.0);
		System.out.println("----------------------------");
		
		//DoubleFunction<R>
		DoubleFunction<Double> doublefunction = (a) -> a*a;
		System.out.println(doublefunction.apply(43.5));
		System.out.println("----------------------------");
		
		//
		
		//BooleanSupplier demo
		BooleanSupplier booleansupplier = () -> true;
		System.out.println(booleansupplier.getAsBoolean());
		System.out.println("----------------------------");
		
	}
}
