package com.manoj.designpatterns.callback;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyObject {

	public void download(Callback function) {
		// TODO Auto-generated method stub
		
		System.out.println("Did some processing... ");
		final String result = "Done";
		function.log(result);
		
	}

	

	public void downloadAsync(Runnable task, Callback function) {
		// TODO Auto-generated method stub
		
		ExecutorService service = Executors.newFixedThreadPool(1);
		try {
			Future future = (Future) service.submit(task);
			future.get();
			if(future.isDone()) {
				function.log("Processing Done and Callback called");
			}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
