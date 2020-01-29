package com.SpringAU.data;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="UserDetails")
public class Buyer
{
	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	@Embedded
	Address address = new Address();
	
	
	
	// @JoinColumn(name="ItemId")
	@OneToOne
	private OnlineShopping onlineShopping;
	
	public OnlineShopping getOnlineShopping() {
		return onlineShopping;
	}

	public void setOnlineShopping(OnlineShopping onlineShopping) {
		this.onlineShopping = onlineShopping;
	}

	public Buyer(String street , int pincode)
	{
		address.setStreet(street);
		address.setPincode(pincode);
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
	
	
}
