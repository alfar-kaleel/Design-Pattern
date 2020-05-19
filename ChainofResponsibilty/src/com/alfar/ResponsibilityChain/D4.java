package com.alfar.ResponsibilityChain;

public class D4 extends Handler{

	@Override
	public double applyDiscount(Bill bill) {
		bill.setDiscount(bill.getDiscount() + bill.getAmount() * 0.05);
		
		System.out.println("Discount D4 calculated");
		
		
		return bill.getDiscount();
		
	}

}
