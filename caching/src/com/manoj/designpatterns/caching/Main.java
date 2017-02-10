package com.manoj.designpatterns.caching;

public class Main {

	public static void main(String... arg) {

		User user = new User("12", "Manoj");

		LRUCache cache = new LRUCache(10);

		cache.save(user);

		user = new User("11", "Yogendra");

		cache.save(user);

		User usr = (User) cache.get(user.getId());

		System.out.println("User Details " + usr);

	}

}
