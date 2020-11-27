package com.biblio.app;

public class Student extends Person {

	private String school;
	
	//Constructors 
	public Student(String name, int age, String school ) {
		super(name, age);
		this.school= school;
	}
	
	public Student(Person p, String school ) {
		super(p.getName(), p.getAge());
		this.school= school;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	//Getters & setters
	public String getSchool() {
		return school;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString()
	{
		return super.toString() + "**"+ this.school;
	}
}
