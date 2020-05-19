package com.alfar.ResponsibilityChain;

public class Bill {
	
	private int billno;
	private double amount;
	private double discount;
	
	
	
	
	
	public Bill(int billno, double amount) {
		
		this.billno = billno;
		this.amount = amount;
	}
	
	
	public int getBillno() {
		return billno;
	}
	public void setBillno(int billno) {
		this.billno = billno;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	

}
