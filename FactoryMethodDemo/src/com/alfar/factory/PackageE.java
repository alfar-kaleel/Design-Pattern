package com.alfar.factory;

public class PackageE extends Lottery{

	@Override
	protected void createLottery() {
		WE.add(new Laptop());
		
	}

}
