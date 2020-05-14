package com.alfar.factory;

public class packageB extends Lottery{

	@Override
	protected void createLottery() {
		WE.add(new Laptop());
		WE.add(new Refrigerator());
		
	}

}
