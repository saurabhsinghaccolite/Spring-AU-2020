package com.SpringAU.data;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="ShoppingApp")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class OnlineShopping
{
	
	//@Embedded
	
	@Id
	private int itemId;
	
	public OnlineShopping()
	{}
	
//	public OnlineShopping(String itemName,int itemPrice)
//	{
//		
//	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
}
