package com.manoj.designpatterns.command;

import java.util.HashMap;
import java.util.Map;

public class CommandInvoker {
	
	Map<String,Command> commands = new HashMap<String,Command>();

	public void addCommand(String key, Command command) {
		// TODO Auto-generated method stub
		commands.put(key,command);
	}

	public void call(String key) {
		// TODO Auto-generated method stub
		commands.get(key).execute();
	}

	

}
