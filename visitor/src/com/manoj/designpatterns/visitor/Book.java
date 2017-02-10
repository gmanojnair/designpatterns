package com.manoj.designpatterns.visitor;

public interface Book {

	public String getName();
	
	public int getPrice();
	
	public String init(Visitor visitor);
}
