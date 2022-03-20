package com.capgemini.Feb17;
import java.util.*;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Players> tree = new TreeSet<Players>(new SortById());
		tree.add(new Players(111,"rohit","mi"));
		tree.add(new Players(102,"msd","csk"));
		tree.add(new Players(110,"yuvraj","kxip"));
		tree.forEach(System.out::println);
	}
}
