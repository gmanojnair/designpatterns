package com.manoj.designpatterns.decorator;

import java.util.logging.Logger;

/**
 * 
 * The Decorator pattern is a more flexible alternative to subclassing. The Decorator class
 * implements the same interface as the target and uses aggregation to "decorate" calls to the
 * target. Using the Decorator pattern it is possible to change the behavior of the class during
 * runtime.
 */

public class Main {

	public static void main(String... arg){
		
		MyLogger logger = new SimpleLogger();
		logger.log("message");
		
		// Extends at 'Runtime' using Decorator without subclassing
		
		logger = new SimpleDateLogger(logger);
		logger.log("message");
		
		
		logger = new ComplexLogger();
		logger.log("message");
		
		
		
		logger = new SimpleDateLogger(logger);
		logger.log("message");
		
	}
	
}
