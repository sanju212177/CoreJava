package com.capgemini.Feb17;
import java.util.*;

public class SortByNameComparator implements Comparator<Players> {

	@Override
	public int compare(Players o1, Players o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
		
	}
}
