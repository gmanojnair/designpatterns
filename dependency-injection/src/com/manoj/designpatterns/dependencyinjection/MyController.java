package com.manoj.designpatterns.dependencyinjection;

import com.google.inject.Inject;

public class MyController {
	
	@Inject
	private MyService service;

	public void execute() {
		service.log();
	}
}
