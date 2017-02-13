package com.manoj.designpatterns.eventdriven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EventDispatcher {

	List<EventListener> listeners = new ArrayList<>();

	Map<Event, List<EventListener>> collection = new HashMap<Event, List<EventListener>>();

	public void addListener(Event event, EventListener listener) {
		// TODO Auto-generated method stub
		List<EventListener> temp = (List<EventListener>) collection.get(event);
		if (temp ==null || temp.isEmpty()) {
			List<EventListener> result = new ArrayList<EventListener>();
			result.add(listener);
			collection.put(event, result);
			return;
		}
		temp.add(listener);

	}

	public void removeListener(Event event, EventListener listener) {
		// TODO Auto-generated method stub
		List<EventListener> temp = (List<EventListener>) collection.get(event);
		temp.remove(listener);

	}

	public void dispatch(Event event) {
		// TODO Auto-generated method stub
		List<EventListener> list = collection.get(event);
		list.forEach(x -> x.execute());

	}
	
	public void asyncdispatch(Event event) {
		// TODO Auto-generated method stub
		List<EventListener> list = collection.get(event);
		list.forEach(x -> x.execute());
		ExecutorService service = Executors.newFixedThreadPool(5);
		
		list.forEach(x -> service.submit(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Async Dispatch start....");
				x.execute();
				System.out.println("Async Dispatch end....");
				
			}
			
		}));

	}
}
