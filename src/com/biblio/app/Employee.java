package com.biblio.app;

public class Employee extends Person {
	
	private double salary;
	
	public Employee()
	{
		
	}
	
	public Employee(String name, int age, double salary ) {
		super(name, age);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return super.toString() + "**"+ this.salary;
	}
}