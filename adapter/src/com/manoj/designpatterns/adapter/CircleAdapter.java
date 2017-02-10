package com.manoj.designpatterns.adapter;

public class CircleAdapter implements Shape{

	private CircleShape circle;
	
	public CircleAdapter(CircleShape circle){
		this.circle = circle;
	}
	
	
	public int area() {
		
		return (int) circle.getArea();
	}
	
	
}
