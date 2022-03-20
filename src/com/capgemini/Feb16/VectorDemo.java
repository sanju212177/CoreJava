package com.capgemini.Feb16;
import java.util.*;
public class VectorDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vector = new Vector<>();
        vector.add("hi");
        vector.add("hello");
        vector.add("hello");
        vector.add("how");
        vector.add("you");
        vector.add("you");
        vector.add("me!");
        vector.add("me!");
        vector.add(null);
        vector.add(null);
        vector.add(0, "welcome");
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements())
        {
            System.out.println(enumeration.nextElement());
        }
        System.out.println("---------------------------------------------");
        Vector vector1 = new Vector<>(vector);
        Iterator iterator = vector1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("---------------------------------------------");
        Vector vector2 = new Vector();
        vector2.addAll(vector);
        vector2.forEach(System.out::println);
	}

}
