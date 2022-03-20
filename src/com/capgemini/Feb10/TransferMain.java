package com.capgemini.Feb10;

import java.util.*;

public class TransferMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transfer t1 = new Transfer("101","neft",45000.00);
		Transfer t2 = new Transfer("102","neft",120000.00);
		Transfer t3 = new Transfer("103","imps",45000.00);
		
		TransferService obj = new TransferService();
		
		List<Transfer> transferList=new ArrayList<Transfer>();
		transferList.add(t1);
		transferList.add(t2);
		transferList.add(t3);
		
		for(Transfer i : transferList) {
			
			obj.setTransferCharge(i);
			obj.setTransferTotal(i);
		}
		
		obj.segregateTransfers(transferList);
		obj.DisplayList();
	}

}
