package com.manoj.designpatterns.abstractfactory;

public class ItalianFoodFactory implements FoodFactory{

	@Override
	public Sweet createSweet() {
		// TODO Auto-generated method stub
		return new BlackForest();
	}

	@Override
	public MainCourse createMainCourse() {
		// TODO Auto-generated method stub
		return new Pasta();
	}

}
