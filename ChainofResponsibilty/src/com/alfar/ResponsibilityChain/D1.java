package com.alfar.ResponsibilityChain;

public class D1 extends Handler{

	@Override
	public double applyDiscount(Bill bill) {
		
		bill.setDiscount(bill.getDiscount() + bill.getAmount() * 0.01);
		
		System.out.println("Discount D1 calculated");
		
		if( bill.getAmount() <= 1000) {
			
			
			return bill.getDiscount();
			
		}
		
		else {
			
			return Successor.applyDiscount(bill);
		}
		
		
		
	}

}
