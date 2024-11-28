package com.labthree;

public class MyPoly {
	public void display() {
		System.out.println("Name:");
	}
	public void display(String firstName) {
		System.out.println(firstName);
	}
	public void display(String firstName , String lastName) {
		System.out.println(firstName+lastName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyPoly obj= new MyPoly();
obj.display();
obj.display("Susan");
obj.display("Bishal", "BK");
	}

}
