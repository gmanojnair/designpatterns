package com.manoj.designpatterns.facade;


public class MySQLHelper {
	
	MyConnection con;
	
	final String mysqlDriver = "";
	

	public MyConnection getSQLConnection(final String url) {
		// complex operations
		loadDriver(mysqlDriver);
		return con = new MyConnection(url);
	}



	public void loadDriver(String url) {
		// TODO Auto-generated method stub
		// load driver for getting connection .. 
		
	}

}
