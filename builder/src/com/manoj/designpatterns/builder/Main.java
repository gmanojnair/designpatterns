package com.manoj.designpatterns.builder;

/**
 * 
 * The intention of the Builder pattern is to find a solution to the telescoping constructor
 * anti-pattern. The telescoping constructor anti-pattern occurs when the increase of object
 * constructor parameter combination leads to an exponential list of constructors. Instead of using
 * numerous constructors, the builder pattern uses another object, a builder, that receives each
 * initialization parameter step by step and then returns the resulting constructed object at once.
 */

public class Main {

	public static void main(String... args) {

		Person person = new Person.PersonBuilder().build();
		
		
		System.out.println("Person : " + person);

		Person newperson = new Person.PersonBuilder().setFace(new Face()).build();

		System.out.println("Person : " + newperson);

	}

}
