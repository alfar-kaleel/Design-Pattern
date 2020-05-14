package com.alfar.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	
	private Map<ProfessionType, Profession> professions = new HashMap<>();
	
	public Registry() {
		
		this.initialize();
		
		
		
	}

	
	protected Profession getProfession(ProfessionType professiontype) {
		
		
		Profession prof = null;
		
		try {
			prof = (Profession) professions.get(professiontype).clone();
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return prof;
	}
	
	
	private void initialize() {
	
		
		Doctor doctor = new Doctor();
		doctor.setSalary(50000);
		doctor.setSpecialization("ENT");
		
		Engineer engineer = new Engineer();
		
		engineer.setSalary(40000);
		engineer.setDepartment("Civil");
		
		professions.put(ProfessionType.DOCTOR, doctor);
		professions.put(ProfessionType.ENGINEER, engineer);
		
		
	}
	
	
}
