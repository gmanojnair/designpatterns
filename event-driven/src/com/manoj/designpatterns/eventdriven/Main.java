package com.manoj.designpatterns.eventdriven;

/**
 * 
 * 
 * @author nairm
 *
 *         An event-driven architecture (EDA) is a framework that orchestrates
 *         behavior around the production, detection and consumption of events
 *         at runtime as well as the responses they evoke. Command based is
 *         expecting something to happen on action , it expects action to be
 *         done Event based is expecting nothing , it only purpose is to notify
 *         that something happened
 *
 */

public class Main {

	public static void main(String... args) {

		Event event = new LogEvent("Log");
		EventDispatcher dispatcher = new EventDispatcher();

		EventListener listener = new FileListener();

		dispatcher.addListener(event, listener);

		listener = new ConsoleListener();

		dispatcher.addListener(event, listener);

		dispatcher.dispatch(event);

		// Async Dispatch

		dispatcher.asyncdispatch(event);

		dispatcher.removeListener(event, listener);

		dispatcher.dispatch(event);

		
	}

}
