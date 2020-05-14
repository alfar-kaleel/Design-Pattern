package com.alfar.factory;

public class PackageC extends Lottery{

	@Override
	protected void createLottery() {
		WE.add(new TV());
		WE.add(new Car());
		WE.add(new Laptop());
		
		
	}
	
	

}
