package com.manoj.designpatterns.chainofresponsibility;

public interface SupportService {

	void handleRequest(ServiceRequest request);

	void setNext(SupportService object);

}
