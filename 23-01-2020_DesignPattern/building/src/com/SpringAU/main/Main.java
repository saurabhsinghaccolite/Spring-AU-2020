package com.SpringAU.main;

import com.SpringAU.composite.Composite;
import com.SpringAU.composite.Leaf;

public class Main {

	public static void main(String[] args) {
		Leaf room = new Leaf("room",15,3);
		Leaf kitchen = new Leaf("kitchen",8,1);
		Leaf hall = new Leaf("hall",20,1);
		Leaf pool = new Leaf("pool",30,1);
		
		
		Composite apartment = new Composite("Apartment",3);
		apartment.addLeaf(room);
		apartment.addLeaf(kitchen);
		apartment.addLeaf(hall);
		
		Composite floor = new Composite("floor",1);
		floor.addLeaf(apartment);
		
		Composite building = new Composite("building",1);
		building.addLeaf(floor);
		building.addLeaf(pool);
		
		building.displayArea();

	}

}
