package com.manoj.designpatterns.flyweight;

/**
 * 
 * 
 * @author nairm
 *
 *         Flyweight pattern is useful when the program needs a huge amount of
 *         objects. It provides means to decrease resource usage by sharing
 *         object instances.
 *         
 *         Helpful for creating large objects at once and reuse them.It needs to be immutable
 *
 */
public class Main {

	public static void main(String... arf) {

		Shape rectangle1 = ShapeFactory.create(Shape.Type.RECTANGLE,100,200);
	
		System.out.println("Area : " + rectangle1.area());

		Shape rectangle2 = ShapeFactory.create(Shape.Type.RECTANGLE,100,200);
		
		System.out.println("Area : " + rectangle2.area());
		
		if(rectangle1 == rectangle2) 
		{
			System.out.println("Both rectangles are of same instance");
		}

	}

}
