package com.manoj.designpatterns.monad;

public class User {
	
	private String name;

	public User(String string) {
		// TODO Auto-generated constructor stub
		
		this.name=string;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	
	

}
