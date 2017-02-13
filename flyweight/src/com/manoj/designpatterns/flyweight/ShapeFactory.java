package com.manoj.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

import com.manoj.designpatterns.flyweight.Shape.Type;

public class ShapeFactory {
	
	private static Map<Shape.Type,Shape> collect = new HashMap<>();

	public static Shape create(Type rectangle,int x,int y) {
		// TODO Auto-generated method stub
		if(Shape.Type.RECTANGLE==rectangle) {
			if( collect.get(rectangle) == null) {
				collect.put( rectangle, new Rectangle(x,y));
			}
		}	
		return collect.get(rectangle) ;
		
	}

}
