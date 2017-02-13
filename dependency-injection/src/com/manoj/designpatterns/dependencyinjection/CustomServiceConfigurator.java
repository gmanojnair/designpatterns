package com.manoj.designpatterns.dependencyinjection;

import com.google.inject.AbstractModule;

public class CustomServiceConfigurator extends AbstractModule  {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bind(MyService.class).to(MyServiceImpl.class);
		
	}

}
