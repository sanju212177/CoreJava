package com.capgemini.Feb16;
import java.util.*;
public class TreeList {
	public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("australia");
        treeSet.add("zambia");
        treeSet.add("ukraine");
        treeSet.add("india");
        treeSet.add("banglades");
        treeSet.add("philippines");
        treeSet.add("china");
        treeSet.forEach(System.out::println);
    }
}
