package com.manoj.designpatterns.command;

public class Visible implements Command {

	Person person;

	Visible() {
		super();

	}

	Visible(Person person) {
		super();
		this.person = person;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		if(person==null) System.out.println("No Person ");
		
		if(person!=null) person.setVisible(false);

	}

}
