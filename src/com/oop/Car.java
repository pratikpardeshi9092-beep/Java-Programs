package com.oop;

public class Car {
	String color,brand;
	
	public void  car()
	{
		System.out.println("Default");
	}
	
	public void car(String c, String b)
	{
		System.out.println("Parameterized constructor");

		color=c;
		brand=b;
	}
	
	public void display()
	{
		System.out.println(color+" "+brand);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car q1=new Car();
		q1.car();
		q1.car("white","tata");
		q1.display();
	}

}
