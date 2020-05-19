package com.alfar.ResponsibilityChain;

public class D3 extends Handler{

	@Override
	public double applyDiscount(Bill bill) {
		
		bill.setDiscount(bill.getDiscount() + bill.getAmount() * 0.04);
		
		System.out.println("Discount D3 calculated");
		
		if(bill.getAmount() <= 5000 && bill.getAmount() >2000) {
		
			
		return bill.getDiscount();
	}

	
	else {
		
		return Successor.applyDiscount(bill);
	}
		
}
}
