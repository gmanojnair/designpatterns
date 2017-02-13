package com.manoj.designpatterns.iterator;

import java.util.List;

public class CustomIterator implements MyIterator {

	List<Item> items;
	private int index = -1;

	CustomIterator(List<Item> items) {
		this.items = items;
	}

	@Override
	public Item next() {
		// TODO Auto-generated method stub
		index = findNextElement();

		if (index == -1)
			return null;
		return items.get(index);
	}

	private int findNextElement() {
		// TODO Auto-generated method stub
		if (hasNext()) {
			int value = this.index + 1;
			return value;

		}
		return -1;
	}

	@Override
	public boolean hasNext() {
		return index == (items.size() - 1) ? false : true;
	}

}
