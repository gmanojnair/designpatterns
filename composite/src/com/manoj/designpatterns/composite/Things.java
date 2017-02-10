package com.manoj.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Things implements Item{
	
	String name;
	
	List<Item> items = new ArrayList<Item>();
	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}



	@Override
	public boolean addItem(Item e) {
		// TODO Auto-generated method stub
		return items.add(e);
	}



	@Override
	public boolean removeItem(Item e) {
		// TODO Auto-generated method stub
		return items.remove(e);
	}



	@Override
	public void displayAllItems() {
		// TODO Auto-generated method stub
		//
	}



	

	@Override
	public boolean hasItems() {
		// TODO Auto-generated method stub
		return false;
		
	}

}
