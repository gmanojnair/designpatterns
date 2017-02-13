package com.manoj.designpatterns.executearound;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileHelper {

	public void createNewFile(String string, Action action) {
		// TODO Auto-generated method stub
		
		// Open File
		try {
			OutputStream stream = new FileOutputStream(new File(string));
			
			action.execute(stream);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
