package com.alfar.prototype;

public class Engineer extends Profession{
 
	private String Department;

	
	public String getDepartment() {
		return Department;
	}

	
	public void setDepartment(String department) {
		Department = department;
	}


	@Override
	public String toString() {
	
		return "Engineer department is : " + Department;
	}
	
	
	
	
}
