package com.manoj.designpatterns.decorator;

public class ComplexLogger  implements MyLogger {

	@Override
	public void log(final String message) {
		// TODO Auto-generated method stub
		
		System.out.println("Complex message");
		
	}

}
