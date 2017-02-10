package com.manoj.designpatterns.caching;

import java.util.LinkedHashMap;;

public class LRUCache<String,Object> extends LinkedHashMap<String,Object> {
	
	private static final long serialVersionUID = 1L;

	
	private final int capacity;
	
	public LRUCache(int capacity) {
		// Call constructor of LinkedHashMap with accessOrder set to true to
		// achieve LRU Cache behavior
		super(capacity + 1, 1.0f, true);
		this.capacity = capacity;
	}
	
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<String,Object> eldest) {
		// Remove the eldest element whenever size of cache exceeds the capacity
		return (size() > this.capacity);
	}


	public void save(User user) {
		// TODO Auto-generated method stub
		super.put((String)user.getId(), (Object) user);
		
	}

}
