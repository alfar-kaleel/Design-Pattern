package com.alfar.prototype;

public class Doctor extends Profession{

	private String Specialization;

	public String getSpecialization() {
		return Specialization;
	}

	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}

	@Override
	public String toString() {
		
		return "Doctor Specialization is :" + Specialization;
	}
	
	
	
}
