package com.manoj.designpatterns.strategy;

import java.io.File;

public interface MyFileContext {

	
	void setStrategy(FileStrategy strategy);

	File createFile(String string);

}
