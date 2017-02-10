package com.manoj.designpatterns.adapter;

public class RectangleShape implements Shape{

	private int length;
	private int breadth;

	
	
	public RectangleShape(int length, int breadth) {
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
