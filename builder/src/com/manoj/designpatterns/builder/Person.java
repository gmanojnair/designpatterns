package com.manoj.designpatterns.builder;

public class Person {
	Face face;
	Hands hands;
	Legs leg;
	
		
	
	public Person(Face face, Hands hands, Legs leg) {
		super();
		this.face = face;
		this.hands = hands;
		this.leg = leg;
	}

	
	public Person(PersonBuilder build) {
		super();
		this.face = build.face;
		this.hands = build.hands;
		this.leg = build.legs;
	}

	public Face getFace() {
		return face;
	}


	public Hands getHands() {
		return hands;
	}


	public Legs getLeg() {
		return leg;
	}



	@Override
	public String toString() {
		return "Person [face=" + face + ", hands=" + hands + ", leg=" + leg
				+ "]";
	}

	public static class PersonBuilder {

		
		Person person ;
		
		Face face;
		Legs legs;
		Hands hands;
		
				
		public PersonBuilder setFace(Face face) {
			// TODO Auto-generated method stub
			this.face = face;
			return this;
		}
		
		public PersonBuilder setHands(Hands hands) {
			// TODO Auto-generated method stub
			this.hands = hands;
			return this;
		}
		
		public PersonBuilder setLegs(Legs legs) {
			// TODO Auto-generated method stub
			this.legs = legs;
			return this;
		}

		
		public Person build(){
			
			return new Person(this);
		}
	}

	
}
