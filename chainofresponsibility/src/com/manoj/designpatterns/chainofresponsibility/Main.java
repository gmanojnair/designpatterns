package com.manoj.designpatterns.chainofresponsibility;

public class Main {
	
	public static void main(String ...arg){
		
		ServiceRequest request1 = new ServiceRequest("Technical");
		
		ServiceRequest request2 = new ServiceRequest("NonTechnical");
		
		SupportService L3 = new L3SupportService();
		L3.setNext(null);
		
		SupportService L2 = new L2SupportService();
		L2.setNext(L3);
		
		SupportService L1 = new L1SupportService();
		L1.setNext(L2);
		
		L1.handleRequest(request1);
		
		L1.handleRequest(request2);
		
		
	}

}
