package com.manoj.designpatterns.iterator;

public class Item {

	private String name;
	private String id;

	public Item(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", id=" + id + "]";
	}

}
