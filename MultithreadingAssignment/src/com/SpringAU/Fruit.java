package com.SpringAU;

public class Fruit
{
	String name;
	int qty;
	int maxqty;
	
	public Fruit()
	{}
	
	public Fruit(String name, int qty, int maxqty) {
		super();
		this.name = name;
		this.qty = qty;
		this.maxqty = maxqty;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getMaxqty() {
		return maxqty;
	}
	public void setMaxqty(int maxqty) {
		this.maxqty = maxqty;
	}
	
}
