package com.manoj.designpatterns.facade;

public class MyDriverFacade {
	
	String type;
	String target;
	
	static MySQLHelper mysqlHelper = new MySQLHelper();;
	static OracleHelper oracleHelper = new OracleHelper();

	public static MyConnection getConnection(String type, String url) {
		// TODO Auto-generated method stub
		switch(type) {
		
		case "MYSQL" : {
			return mysqlHelper.getSQLConnection(url);
		}
		
		case "Oracle" : {
			return oracleHelper.getMyOracleConnection(url);
		}
		
		}
		
		return null;
	}

}
