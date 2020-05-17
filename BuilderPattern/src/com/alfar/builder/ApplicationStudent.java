package com.alfar.builder;



public class ApplicationStudent {
	
	
	
	public static void main(String[] args) {
		
		Student.Builder builder = new Student.Builder("Alfar");
		
		
		Student student = builder.age(30).gender("male").build();
		
		
		System.out.println(student);
		
	}

}
