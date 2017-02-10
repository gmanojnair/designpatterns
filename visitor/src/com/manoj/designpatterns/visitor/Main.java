package com.manoj.designpatterns.visitor;

public class Main {

	public static void main(String... arg){
		
		Book book1 = new ComicBook("Tarzan",123);
		
		Book book2 = new ComicBook("Superman",222);
		
		Visitor vistor = new CustomerVisitor();
		System.out.println(book1.init(vistor));
		
		vistor = new EmployeeVisitor();
		System.out.println(book1.init(vistor));
		
	}
	
	
}
