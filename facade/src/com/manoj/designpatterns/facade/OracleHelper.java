package com.manoj.designpatterns.facade;


public class OracleHelper {
	
	MyConnection con;
	private String oracleDriver = "";

	public MyConnection getMyOracleConnection(final String url) {
		// complex operations
		loadDriver(oracleDriver );
		return con = new MyConnection(url);
	}



	public void loadDriver(String url) {
		// TODO Auto-generated method stub
		// load driver for getting connection .. 
		
	}
}
