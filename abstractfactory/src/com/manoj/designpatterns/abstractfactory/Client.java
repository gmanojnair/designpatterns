package com.manoj.designpatterns.abstractfactory;

public class Client {

	public FoodFactory createFactory(FoodType type) {
		// TODO Auto-generated method stub
		if(type.equals(FoodType.INDIAN)) return new IndianFoodFactory();
		if(type.equals(FoodType.ITALIAN)) return new ItalianFoodFactory();
		
		return null;
	}

}
