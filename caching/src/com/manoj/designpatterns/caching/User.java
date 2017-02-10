package com.manoj.designpatterns.caching;

public class User {

	String id;
	String name;
	
	public User(String id, String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}

	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

	
	

}
