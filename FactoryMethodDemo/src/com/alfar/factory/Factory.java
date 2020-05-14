package com.alfar.factory;

public class Factory {
	
	public static Lottery choseLottery(WinCode code) {
		
		
		switch(code) {
		
		case A :
			return new PackageA();
			
		case B :
			return new packageB();
			
		case C : 
			return new PackageC();
			
		case D :
			return new PackageD();
			
		case E :
			return new PackageE();
			
		default :
			return null;
		
		
		
		
		
		
		}
		
		
		
		
		
	}

}
