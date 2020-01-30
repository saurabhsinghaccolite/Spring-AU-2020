package com.SpringAU.composite;

public class Leaf implements Component
{
	String name;
	double area;
	int number;

	public Leaf()
	{}
	
	public Leaf(String name, double area, int number) {
		super();
		this.name = name;
		this.area = area;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public void displayArea() {
		System.out.println("Area of "+name+" : "+area);
	}
	
	
}
