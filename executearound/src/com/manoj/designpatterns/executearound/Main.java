package com.manoj.designpatterns.executearound;

/**
 * 
 * 
 * @author nairm
 * 
 * The Execute Around idiom specifies some code to be executed before and after a method. Typically
 * the idiom is used when the API has methods to be executed in pairs, such as resource
 * allocation/deallocation or lock acquisition/release.
 *
 */

class Main {
	
	public static void main(String...arg){
		
		FileHelper helper = new FileHelper();
		helper.createNewFile("File.txt",s -> {
			System.out.println("Closed the stream....");
			try {
				s.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
	}

}
