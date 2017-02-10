package com.manoj.designpatterns.composite;

public class Main {

	public static void main(String... arg) {

		Things things = new Things();
		things.name = "Box";

		things.addItem(new Eraser());
		things.addItem(new Rubber());
		Pens pens = (new Pens());
		pens.addItem(new InkPen());
		pens.addItem(new BallPen());
		things.addItem(new Pens());

		System.out.println("Thing " + things.name);

		things.displayAllItems();

	}

}
