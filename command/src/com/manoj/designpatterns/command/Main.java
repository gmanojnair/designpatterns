package com.manoj.designpatterns.command;

/**
 * 
 * The Command pattern is a behavioral design pattern in which an object is used
 * to encapsulate all information needed to perform an action or trigger an
 * event at a later time. decouples the invoker from the receiver of a request
 */

public class Main {
	public static void main(String... args) {

		// Receiver

		Person person = new Person();

		// Create command that takes request from invoker to receiver

		Command visiblecommand = new Visible(person);

		Command invisiblecommand = new InVisible(person);

		// invoker configures all commands
		CommandInvoker invoker = new CommandInvoker();
		invoker.addCommand("visible", visiblecommand);
		invoker.addCommand("invisible", invisiblecommand);

		// invoker calls the command
		invoker.call("visible");
		invoker.call("invisible");

		// Executor.execute(new Runnable() { } )

	}

}
