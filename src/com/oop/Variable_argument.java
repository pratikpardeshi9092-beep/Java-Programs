package com.oop;

public class Variable_argument 
{
	static void add(int...num)
	{
		System.out.println("in add(int...num)");
		int sum=0;
		for(int i:num)
		sum=sum+i;
		System.out.println("add is "+sum);

	}
	
	static double  add(int j, double k,float i)
	{
		System.out.println("int add(int,double,double,float)  ");

		double res=j+k+i;
		return res;
	}
	
	static  String add(String s1, String s2)
	{
		String s=s1+s2;
		return s;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(1,4);
		add(12,13,14);
		add(69,7,8,9);
		double s=add(12,5.5,12.1f);
		System.out.println("add is "+s);
		String s1=add("hello ","java");
		System.out.println(s1);

		

		

	}

}
