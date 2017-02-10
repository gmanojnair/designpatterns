package com.manoj.designpatterns.decorator;

import java.util.logging.Logger;

public class SimpleLogger implements MyLogger {

	@Override
	public void log(final String message) {
		// TODO Auto-generated method stub
		
		System.out.println(message);
		
	}

}
