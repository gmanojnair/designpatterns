package com.manoj.designpatterns.bridge;

public class Client {
	
	Shape shape;

	public void setShape(Shape shape) {
		// TODO Auto-generated method stub
		this.shape=shape;
	}

	public void draw() {
		// TODO Auto-generated method stub
		
		shape.draw();
		
	}

}
