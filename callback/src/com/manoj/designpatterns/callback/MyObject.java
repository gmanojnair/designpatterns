package com.manoj.designpatterns.callback;

public class MyObject {

	public void download(Callback function) {
		// TODO Auto-generated method stub
		
		System.out.println("Did some processing... ");
		final String result = "Done";
		function.log(result);
		
	}

}
