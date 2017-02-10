package com.manoj.designpatterns.delegate;

public class MyObject {

	Strategy function ; 
	
	
	public MyObject(Strategy function) {
		super();
		this.function = function;
	}


	public void download() {
		// TODO Auto-generated method stub
		
		System.out.println("Did some processing... ");
		function.log();
		
	}

}
