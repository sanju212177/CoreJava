package com.capgemini.Feb10;

public class Transfer {
	private String transferId;
	private String transferType;
	private double charge;
	private double amount;
	private double total;
	public Transfer(String transferId, String transferType, double charge, double amount, double total) {
		super();
		this.transferId = transferId;
		this.transferType = transferType;
		this.charge = charge;
		this.amount = amount;
		this.total = total;
	}
	public String getTransferId() {
		return transferId;
	}
	public void setTransferId(String transferId) {
		this.transferId = transferId;
	}
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
	public double getCharge() {
		return charge;
	}
	public void setCharge(double charge) {
		this.charge = charge;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	Transfer(String transferId,String transferType,Double amount) {
		this.transferId = transferId;
		this.transferType = transferType;
		this.amount = amount;
	}
}
