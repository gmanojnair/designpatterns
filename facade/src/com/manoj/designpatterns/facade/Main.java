package com.manoj.designpatterns.facade;


/**
 * Identify the desired unified interface for a set of subsystem doing complex operations
 * For example Start computer in cloud requires configure ec2 type, add volume , add roles 
 * and start instance combine to single run service
 * 
 * A facade exposes simplified functions that are mostly called
 * 
 * */

public class Main {

	public static void main(String...args){
		
		
		MyConnection connection = MyDriverFacade.getConnection("Oracle","url");
		
		
		
		
	}
	
	
}
