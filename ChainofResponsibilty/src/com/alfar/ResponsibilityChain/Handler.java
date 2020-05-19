package com.alfar.ResponsibilityChain;

public abstract class Handler {
	
	
	Handler Successor;

	public Handler getSuccessor() {
		return Successor;
	}

	public void setSuccessor(Handler successor) {
		Successor = successor;
	}
	
	public abstract double applyDiscount(Bill bill);
		
		
		
	

}
