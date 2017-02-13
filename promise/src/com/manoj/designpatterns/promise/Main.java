package com.manoj.designpatterns.promise;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 
 * @author nairm
 * 
 * *  The Promise object is used for asynchronous computations. A Promise represents an operation
 *  that hasn't completed yet, but is expected in the future.
 */

public class Main {
	
	public static void main(String...arg){
		
		Runnable task = new Runnable() {
			public void run() {
				
				for(int i=0 ; i < 100000 ; i++){
					
					// System.out.println("Done..." + i);
					
				}
				
				
			}
		};
		
		Runnable task1 = new Runnable() {
			public void run() {
				System.out.println("Done...");
				
				
			}
		};	
		
       ExecutorService service = Executors.newFixedThreadPool(1);
       Future result = service.submit(task);
       if(result.isDone()){
    	   Future result1 = service.submit(task1);
       }
       
       // Promise
       CompletableFuture promise = CompletableFuture.runAsync(task1, service);
       promise.thenRun(task1);
       
       
       
       
       
	}

}
