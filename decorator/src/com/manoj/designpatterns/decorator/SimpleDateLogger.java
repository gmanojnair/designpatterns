package com.manoj.designpatterns.decorator;

import java.util.Calendar;

public class SimpleDateLogger implements MyLogger {

	MyLogger logger;
	
	public SimpleDateLogger(MyLogger logger)
	{
		this.logger = logger;
	}
	
	@Override
	public void log(String message) {
		// TODO Auto-generated method stub

		final String timestamp = Calendar.getInstance().getTime().toString();
		
		System.out.println( timestamp + ":" + message );
		
		
	}

}
