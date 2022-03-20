package com.capgemini.Feb17;

import java.util.Comparator;

public class SortById implements Comparator<Players> {

	@Override
	public int compare(Players o1, Players o2) {
		// TODO Auto-generated method stub
		return o1.getPlayerId()-o2.getPlayerId();
	}

}
