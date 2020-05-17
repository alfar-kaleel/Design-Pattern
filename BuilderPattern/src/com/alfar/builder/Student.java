package com.alfar.builder;

public class Student {
	
	private String name;
	
	private int age;
	
	private String department;
	
	private String gender;

	public Student(Builder builder) {

		this.name = builder.name;
		this.age = builder.age;
		this.department = builder.department;
		this.gender = builder.gender;
		
		
	}




	
	
	
	static class Builder{
		
		private String name;
		
		private int age;
		
		private String department;
		
		private String gender;
		
		public Student build() {
			
			return new Student(this);
		}
		
		public Builder(String name) {
			
			this.name = name;
			
		}
		
		
		public Builder age(int age) {
			
			this.age = age;
			
			return this;
			
		}
		
		
	public Builder department(String department) {
			
			this.department = department;
			
			return this;
			
		}
	
	public Builder gender(String gender) {
		
		this.gender = gender;
		
		return this;
		
	}
		
		
		
	}







	@Override
	public String toString() {
		
		return "Student{"+ "Name :" + name + " Age :"+ age + " Department :"+ department + " Gender :" + gender + "}";
	}
	
	
	
	
	
	
}
