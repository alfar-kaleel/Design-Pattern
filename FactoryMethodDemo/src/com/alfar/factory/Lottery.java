package com.alfar.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Lottery {
	
	protected List<Winningequipment> WE = new ArrayList<>();
	
	
	public Lottery() {
		
		createLottery();
		
	}
	
	protected  abstract void createLottery();

	@Override
	public String toString() {
		
		return " "+ WE;
	}
	
	
		
	

}
