package com.manoj.designpatterns.chainofresponsibility;

public class L1SupportService implements SupportService {
	
	SupportService next;

	@Override
	public void handleRequest(ServiceRequest request) {
		// TODO Auto-generated method stub
		if(request.getType().equals("NonTechnical"))
		   {
			System.out.println("Processed"+request.getType());
			return;
		   }
			
        next.handleRequest(request);
	}

	@Override
	public void setNext(SupportService object) {
		// TODO Auto-generated method stub
		next=object;
		
	}

	
	
}
