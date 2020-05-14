package com.alfar.factory;

/*
 
 The scenario : A person choses a lottery ticket randomly.The winning equipments are as below
 
 Ticket A : Car,Refrigerator
 Ticket B : Laptop,Refrigerator
 Ticket C : TV, Car,Laptop
 Ticket D : Nothing
 Ticket E : Laptop
 
 
 
 */

public class FactoryTest {
	

	public static void main(String[] args) {
		
		
		Lottery lottery1 = Factory.choseLottery(WinCode.B);
		
		System.out.println("You have won :" + lottery1);
		
		
		Lottery lottery2 = Factory.choseLottery(WinCode.D);
		
		System.out.println("You have won :" + lottery2);
		
	}
	
}
