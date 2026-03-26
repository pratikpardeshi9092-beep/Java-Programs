package com.oop;

public class Method_overloading 
{
	//int num1,num2;
	
	static void add(int i,int j)
	{
		
		System.out.println(i+j);
	}
	
	static void add(int i,int j,int k)
	{
		System.out.println(i+j+k);

	}
	
	static void add(String i,String j)
	{
		System.out.println(i+j);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_overloading q1=new Method_overloading();
		add(25, 25);
		add(25,25,25);
		add("om","mo");

	}

}
