package com.manoj.designpatterns.adapter;

public class CircleShape implements DifferentShape{
	int radius;

	CircleShape(int radius) {
		this.radius = radius;
	}

	public float getArea() {

		return (float) 3.14 * this.radius * this.radius;
	}

}
