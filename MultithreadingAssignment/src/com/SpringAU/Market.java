package com.SpringAU;

import java.util.ArrayList;
import java.util.List;

public class Market 
{
	
	public static List<Fruit> list;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Fruit mango = new Fruit("mango",0,10);
		Fruit apple = new Fruit("apple",0,10);
		Fruit banana = new Fruit("banana",0,10);
		Fruit orange = new Fruit("orange",0,10);
		
		list = new ArrayList<Fruit>();
		list.add(mango);
		list.add(apple);
		list.add(banana);
		list.add(orange);
		
		for(int i = 1 ; i < 5 ; i++) {
			new Thread(new Producer(), "Farmer_" + i).start();
			new Thread(new Consumer(), "Buyer" + i).start();
		}

		
	}

}
