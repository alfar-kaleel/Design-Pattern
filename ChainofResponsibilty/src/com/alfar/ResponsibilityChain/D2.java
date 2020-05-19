package com.alfar.ResponsibilityChain;

public class D2 extends Handler{

	@Override
	public double applyDiscount(Bill bill) {
		
		bill.setDiscount(bill.getDiscount() + bill.getAmount() * 0.03);
		
		System.out.println("Discount D2 calculated");
		
		if(bill.getAmount() > 1000 && bill.getAmount() <= 2000) {
			
		
			return bill.getDiscount();
			
			
		}
		
		else {
			
			return Successor.applyDiscount(bill);
		}
		
	}
	
	
	

}
