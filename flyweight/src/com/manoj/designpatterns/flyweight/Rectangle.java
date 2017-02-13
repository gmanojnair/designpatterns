package com.manoj.designpatterns.flyweight;

public class Rectangle implements Shape {
	
	int length;
	int breadth;
	
	
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	public int area() {
		// TODO Auto-generated method stub
		return length * breadth;
	}


	

}
