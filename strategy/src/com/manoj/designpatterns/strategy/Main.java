package com.manoj.designpatterns.strategy;

import java.io.File;

public class Main {
	
	public static void main(String... arf){
		
		//  Define context having all strategies
		// decouples the components and services from the protocol specifics of system information
		
		MyFileContext context = MyFileContextFactory.create();
		
		context.setStrategy(new WindowsFileStrategy());
		
		File windowsfile = context.createFile("Windows.txt");
		
		context.setStrategy(new LinuxFileStrategy());
		
		File linuxfile = context.createFile("Linux.txt");
		
		
	}

}
