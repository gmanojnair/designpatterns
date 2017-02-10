package com.manoj.designpatterns.delegate;

public class Main {

	final static String CLASSNAME = "Main";

	public static void main(String... args) {

		Strategy function = new Strategy(CLASSNAME);

		MyObject object = new MyObject(function);

		object.download();

	}

}
