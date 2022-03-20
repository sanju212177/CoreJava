package com.capgemini.Feb16;
import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        
        list.add("hi");
        list.add("hello");
        list.addFirst("you");
        list.addLast("me");
//        System.out.println( list.peekLast());
        System.out.println(list.pollLast());
        System.out.println("LinkedList elements :");
        list.forEach(System.out::println);
    }
}
