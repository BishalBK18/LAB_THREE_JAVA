package com.labthree;

public class Dog extends Animal implements Reptiles,Abc{
	public void name() {
		System.out.println("Lucky");
	}

	public void eatFood() {
		super.eatFood();
		System.out.println("Dog is eating ");
		super.sleep();
	}

//public void move() {
//	System.out.println("animal moving");
//}
//public void swim ()
//{
//	System.out.println("swimming");
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj = new Dog();
		obj.name();
		obj.eatFood();
		obj.move();
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
System.out.println("swimmig");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
System.out.println("moving");
	}

	@Override
	public void danger() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void letsGo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

}
