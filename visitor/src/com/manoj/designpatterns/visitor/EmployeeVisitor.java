package com.manoj.designpatterns.visitor;

public class EmployeeVisitor implements Visitor {

	@Override
	public String display(Book comicBook) {
		// TODO Auto-generated method stub
		return "Name : " + comicBook.getName() + "Price " + comicBook.getPrice();
	}

}
