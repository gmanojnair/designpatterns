package com.manoj.designpatterns.composite;

public interface Item {

	public String getName();
	
	public boolean addItem(Item item);
	
	public boolean removeItem(Item item);
	
	public boolean hasItems();
	
	public void displayAllItems();
	
}
