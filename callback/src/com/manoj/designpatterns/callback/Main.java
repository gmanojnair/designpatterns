package com.manoj.designpatterns.callback;

public class Main {

	final static String CLASSNAME = "Main";

	public static void main(String... args) {

		Callback function = new Callback();

		MyObject object = new MyObject();

		object.download(function);

	}

}
