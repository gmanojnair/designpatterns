package com.manoj.designpatterns.strategy;

import java.io.File;

public class MyContextImpl implements MyFileContext {
	FileStrategy strategy;
	

	@Override
	public void setStrategy(FileStrategy strategy) {
		// TODO Auto-generated method stub
		this.strategy=strategy;
	}


	@Override
	public File createFile(String string) {
		// TODO Auto-generated method stub
		return new File(string);
	}

}
