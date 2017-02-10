package com.manoj.designpatterns.adapter;

/*
 * 
 * There are two variations of the Adapter pattern: The class adapter implements the adaptee's
 * interface whereas the object adapter uses composition to contain the adaptee in the adapter
 * object. This example uses the object adapter approach.
 * Adapter add standard interface to be compatible with third party class interface 
 */



public class Main {

	public static void main(String... args) {

		Client client = new Client();

		client.setShape(new RectangleShape(10, 20));
		int result = client.area();

		client.setShape(new CircleAdapter(new CircleShape(10)));

		result = client.area();

	}

}
