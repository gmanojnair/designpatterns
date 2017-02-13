package com.manoj.designpatterns.iterator;

/**
 * 
 * @author nairm The Iterator pattern is a design pattern in which an iterator
 *         is used to traverse a container and access the container's elements.
 *         The Iterator pattern decouples algorithms from containers.
 */

public class Main {

	public static void main(String... args) {

		CustomCollection collection = new CustomCollection();
		Item item = new Item("Sony TV", "FDF");
		collection.addItem(item);
		collection.addItem(new Item("Samsumg TV", "SADSADSA"));
		collection.addItem(new Item("LG TV", "JHGJHGJ"));
		MyIterator itr = collection.iterator();
		while (itr.hasNext()) {
			System.out.println("Item in Collection - " + itr.next());
		}

		collection.removeItem(item);

		MyIterator itr1 = collection.iterator();
		while (itr1.hasNext()) {
			System.out.println("Item in Collection - " + itr1.next());
		}

	}

}
