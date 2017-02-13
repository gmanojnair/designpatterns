package com.manoj.designpatterns.state;

public class Game {

	State state;

	public Game() {
		super();
		this.state = State.CREATE;
	}

	public void setState(State state) {
		// TODO Auto-generated method stub

		this.state = state;

	}

	public void run() {
		// TODO Auto-generated method stub
		switch (this.state) {
		case CREATE:
		case STOP:
		case START:
		default: {

			System.out.println("Current Running State : " + this.state);
		}

		}

	}

}
