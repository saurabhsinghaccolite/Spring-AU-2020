package com.SpringAU.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component
{
	String name;
	int total;
	int number;
	
	List<Component> list=new ArrayList<>();
	
	Composite()
	{
		
	}
	
	public Composite(String name,int number) {
		super();
		this.name = name;
		this.number = number;
	}

	
	public void addLeaf(Component comp)
	{
		list.add(comp);
	}

	@Override
	public void displayArea() {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.size(); i++) 
		{
			if(list.get(i) instanceof Leaf)
				this.total+=((Leaf)list.get(i)).getArea()*((Leaf)list.get(i)).getNumber();
			else
			{
				if(((Composite)list.get(i)).total==0)
				{
					((Composite)list.get(i)).displayArea();
				}
				this.total+=((Composite)list.get(i)).total;
			}
		}
		System.out.println("Area of " + name + " : " + total);
		total *= number;
		
	}

}
