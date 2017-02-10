package com.manoj.designpatterns.bridge;

/*Bridge is used when we need to decouple an abstraction from its implementation
 *  so that the two can vary independently , here Shape is acting as bridge
 */
public class Main {

	public static void main(String... args) {

		Client client = new Client();

		client.setShape(new Circle(100));

		client.draw();

		client.setShape(new Rectangle());

		client.draw();

	}

}
