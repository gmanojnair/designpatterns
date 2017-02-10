package com.manoj.designpatterns.singleton;

public enum SingleTon {

	INSTANCE("Single");

	SingleTon(String name) {
		this.name = name;
	}

	private final String name;

	@Override
	public String toString() {
		return this.name;
	}

}
