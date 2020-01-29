package com.SpringAU.data;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

//@Embeddable
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Comodity extends OnlineShopping
{
	
	
	
	private String itemName;
	private int itemPrice;
	
	public  Comodity()
	{
		this.setItemId(420);
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
}
