package com.manoj.designpatterns.dependencyinjection;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * 
 * @author nairm
 * 
 *         Implementing dependency injection using juice
 */
public class Main {

	public static void main(String... arg) {

		Injector injector = Guice
				.createInjector(new CustomServiceConfigurator());

		MyController controller = injector.getInstance(MyController.class);

		controller.execute();

	}
}
