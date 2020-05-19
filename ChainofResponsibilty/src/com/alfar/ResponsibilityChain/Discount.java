package com.alfar.ResponsibilityChain;

public class Discount extends Handler{

	@Override
	public double applyDiscount(Bill bill) {
	
		return Successor.applyDiscount(bill);
	}

}
