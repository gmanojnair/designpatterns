package com.manoj.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class CustomCollection {

	private List<Item> items;
	
	private MyIterator iterator ;

	public CustomCollection() {
		super();
		// TODO Auto-generated constructor stub
		items = new ArrayList<Item>();
	}

	public MyIterator iterator() {
		// TODO Auto-generated method stub
		this.iterator = new CustomIterator(items);
		return this.iterator;
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public void removeItem(Item item) {
		this.items.remove(item);
	}

	
	
	
	
	
}
