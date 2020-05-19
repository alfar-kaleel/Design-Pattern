package com.alfar.ResponsibilityChain;

/* 
 
 Scenario:
 
 A retail shop owner decides to provide discounts according to the customer's amount of bill cumulatively.
 Amount and discount are below
 
  
 
 0-1000 - 1% (D1)
 1000-2000 - 3% (D2)
 2000-5000 -  4% (D3)
 above 5000 - 5% (D4)
 
 
 example : If a person has 5500 bill amount.He has 13% of discount
 
  He wanted the system to calculate the discount according to the bill
 */



public class Application {

	public static void main(String[] args) {
		
		Discount discount = new Discount();
		D1 d1 = new D1();
		D2 d2 = new D2();
		D3 d3 = new D3();
		D4 d4 = new D4();
		
		discount.setSuccessor(d1);
		d1.setSuccessor(d2);
		d2.setSuccessor(d3);
		d3.setSuccessor(d4);
		
		
		
		Bill bill1 = new Bill(1,500);
		System.out.println("The total discount is : " + discount.applyDiscount(bill1));
		
		
		Bill bill2 = new Bill(1,1200);
		System.out.println("The total discount is : " + discount.applyDiscount(bill2));
		
		Bill bill3 = new Bill(1,2500);
		System.out.println("The total discount is : " + discount.applyDiscount(bill3));
		
		Bill bill4 = new Bill(1,6000);
		System.out.println("The total discount is : " + discount.applyDiscount(bill4));

	}

}
