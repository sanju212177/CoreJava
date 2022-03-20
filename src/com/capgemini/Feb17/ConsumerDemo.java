package com.capgemini.Feb17;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a word >>>");
        System.out.println("Enter a number >>>");
//        String word = scanner.next();
        int num = scanner.nextInt();
//        Consumer<String> consumer = (String input)-> System.out.println(input.toUpperCase());
        Consumer<Integer> consumer2 = abc -> System.out.println(++abc);
//        process(consumer, word);
        process(consumer2, num);
    }
    public static void process(Consumer<Integer> consumer, Integer input){
        consumer.accept(input);
        
    }
}
