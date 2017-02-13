package com.manoj.designpatterns.eventdriven;

public class LogEvent implements Event {
	
	final String type;
	
	

	public LogEvent(String type) {
		super();
		this.type = type;
	}



	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

}
