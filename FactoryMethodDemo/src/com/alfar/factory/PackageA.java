package com.alfar.factory;

public class PackageA extends Lottery{

	@Override
	protected void createLottery() {
		WE.add(new Car());
		WE.add(new Refrigerator());
		
	}

	
	
}
