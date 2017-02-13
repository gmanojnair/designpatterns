package com.manoj.designpatterns.callback;

/**
 * 
 * @author nairm
 * 
 * Invoking Caller function later after the process is done.If processing is done in a seperate thread ditached from main thread it becomes async
 *
 */

public class Main {

	final static String CLASSNAME = "Main";

	public static void main(String... args) {
		
		// Sync Callback

		Callback function = new Callback();

		MyObject object = new MyObject();

		object.download(function);
		
		// Async Callback
		
		Runnable task = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Task is Running...");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Task is Stopped...");
				
			}
			
		};
		object.downloadAsync(task,function);

	}

}
