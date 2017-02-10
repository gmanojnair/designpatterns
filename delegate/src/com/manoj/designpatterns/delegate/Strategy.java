package com.manoj.designpatterns.delegate;

public class Strategy {

	final String name ;
	public Strategy(String classname) {
		// TODO Auto-generated constructor stub
		this.name=classname;
	}

	public void log ( ) {
		
		System.out.println("Class logged" + this.name);
	}
	
	
}
