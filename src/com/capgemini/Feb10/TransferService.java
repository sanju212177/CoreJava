package com.capgemini.Feb10;

import java.util.*;

public class TransferService {
	private List<Transfer> impsList = new ArrayList<Transfer>();
	private List<Transfer> neftList = new ArrayList<Transfer>();
	
	public void setTransferCharge(Transfer transfer){
		if(transfer.getTransferType().equalsIgnoreCase("imps")) {
			if(transfer.getAmount()<25000)
				transfer.setCharge(5);
			else if(transfer.getAmount()<=100000)
				transfer.setCharge(10);
			else
				transfer.setCharge(15+((transfer.getAmount()-100000)/25000)*10);
		}
		else if(transfer.getTransferType().equalsIgnoreCase("neft")) {
			if(transfer.getAmount()<25000)
				transfer.setCharge(50);
			else if(transfer.getAmount()<=100000)
				transfer.setCharge(150);
			else
				transfer.setCharge(250+((transfer.getAmount()-100000)/25000)*50);
		}
	}
	
	public void setTransferTotal(Transfer transfer){
		transfer.setTotal(transfer.getAmount()+transfer.getCharge());
	}
	
	public void segregateTransfers(List<Transfer> transferList) {
		for(Transfer i : transferList) {
			if(i.getTransferType().equalsIgnoreCase("imps")) {
				impsList.add(i);
			}
			else if(i.getTransferType().equalsIgnoreCase("neft")) {
				neftList.add(i);
			}
		}
	}
	public void DisplayList() {
		System.out.println("IMPS List :\n");
		for(Transfer i : impsList) {
			System.out.println("TransferId="+i.getTransferId());
			System.out.println("TransferType="+i.getTransferType());
			System.out.println("Charge="+i.getCharge());
			System.out.println("Amount="+i.getAmount());
			System.out.println("Total="+i.getTotal()+"\n");
		}
		System.out.println("-------------------------------------\n");
		
		System.out.println("NEFT List :\n");
		for(Transfer i : neftList) {
			System.out.println("TransferId="+i.getTransferId());
			System.out.println("TransferType="+i.getTransferType());
			System.out.println("Charge="+i.getCharge());
			System.out.println("Amount="+i.getAmount());
			System.out.println("Total="+i.getTotal()+"\n");
		}
		System.out.println("-------------------------------------\n");
	}

	public List<Transfer> getImpsList() {
		return impsList;
	}

	public void setImpsList(List<Transfer> impsList) {
		this.impsList = impsList;
	}

	public List<Transfer> getNeftList() {
		return neftList;
	}

	public void setNeftList(List<Transfer> neftList) {
		this.neftList = neftList;
	}

	public TransferService() {
	}
}
