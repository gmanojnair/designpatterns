package com.manoj.designpatterns.abstractfactory;

public class IndianFoodFactory implements FoodFactory{

	@Override
	public Sweet createSweet() {
		// TODO Auto-generated method stub
		return new GulabJamun();
	}

	@Override
	public MainCourse createMainCourse() {
		// TODO Auto-generated method stub
		return new Biryani();
	}

}
