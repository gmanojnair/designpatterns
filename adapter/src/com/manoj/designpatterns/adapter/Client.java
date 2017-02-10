package com.manoj.designpatterns.adapter;

public class Client {

	Shape shape;
	
	public void setShape(Shape shape) {
		// TODO Auto-generated method stub
		this.shape = shape;
	}

	public int area() {
		// TODO Auto-generated method stub
		return shape.area();
	}

}
