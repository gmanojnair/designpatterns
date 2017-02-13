package com.manoj.designpatterns.state;

public class Main {
	
	public static void main(String... arg) {
		
		Game game = new Game();
		game.setState(State.START);
		game.run();
		game.setState(State.STOP);
		game.run();
		game.setState(State.RESTART);
		game.run();
		
		
	}

}
