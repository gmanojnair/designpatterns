package com.manoj.designpatterns.visitor;

public class ComicBook implements Book{

	String name;
	int price;

	public ComicBook(String name,int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String init(Visitor visitor){
		return visitor.display(this);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
	
	
	
}
