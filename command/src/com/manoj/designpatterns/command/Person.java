package com.manoj.designpatterns.command;

public class Person {

	boolean visible = false;

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
		 System.out.println(" Person Visible "+ visible);
	}
	
	
}
