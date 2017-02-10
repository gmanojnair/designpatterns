package com.manoj.designpatterns.command;

public class InVisible implements Command {

	Person person;

	InVisible() {
		super();

	}

	InVisible(Person person) {
		super();
		this.person = person;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		if(person==null) System.out.println("No Person ");
		
		if(person!=null) person.setVisible(true);

	}

}
