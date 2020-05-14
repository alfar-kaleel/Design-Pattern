package com.alfar.factory;

public class PackageD extends Lottery{

	@Override
	protected void createLottery() {
		WE.add(new Nothing());
		
	}
	
	

}
