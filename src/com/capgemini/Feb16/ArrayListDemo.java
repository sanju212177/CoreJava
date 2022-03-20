package com.capgemini.Feb16;
import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Country Names >>> ");
        //immutable list or unmodifiable list
        List<String> list = List.of("india", "china", "canada",  "russia", "uk", "usa");
        //modifiable list
        List<String> list2 = new ArrayList<>();
        list2.add("nepal");
        list2.add("pakistan");
        list2.add("bangladesh");
        list2.add("srilanka");
        list2.add("china");
        /* for (int i = 0; i < 5; i++) {
            list.add(scanner.next());
        }*/
        //list.forEach(System.out::println);
        System.out.println("Search a country by name >>>");
        String country = scanner.next();
        System.out.println("Country Found? "+list2.contains(country));
        System.out.println("Country at first Index: "+list2.get(0));
        list2.remove("uae");
        list2.forEach(c -> System.out.println(c));
    }
}
