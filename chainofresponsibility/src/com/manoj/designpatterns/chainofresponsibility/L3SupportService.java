package com.manoj.designpatterns.chainofresponsibility;

public class L3SupportService implements SupportService {
	private SupportService next;


	@Override
	public void handleRequest(ServiceRequest request) {
		// TODO Auto-generated method stub
		
			
        System.out.println("Done");;

	}

	
	@Override
	public void setNext(SupportService object) {
		// TODO Auto-generated method stub
		next=object;
		
	}
}
