package com.alfar.prototype;

public class Testprototype {
	
	public static void main(String [] args) {
		
		Registry registry = new Registry();
		
		Doctor doctor = (Doctor) registry.getProfession(ProfessionType.DOCTOR);
		
		System.out.println(doctor);
		
		doctor.setSpecialization("Ortheopedic");
		
		System.out.println(doctor);
		
		Doctor doctor1 = (Doctor) registry.getProfession(ProfessionType.DOCTOR);
		
		
		System.out.println(doctor1);
		
		
		
		
	}

}
