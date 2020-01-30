package com.SpringAU.AOp.assignment.model;

public class Employee
{
	String name;
	int id;
	
	public Employee()
	{}

	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
}
