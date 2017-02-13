package com.manoj.designpatterns.monad;

import java.util.Objects;

public class Main {
	
	
	public static void main(String ... arg) {
		
		User usr = new User("name");
		
		String result = Validator.of(usr).validate(User::getName, Objects::nonNull, "name is null").get().toString();
		
		System.out.println("Result "+ result);
	}

}
