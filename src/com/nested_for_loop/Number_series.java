package com.nested_for_loop;

public class Number_series
{
	public static void num(int terms)
	{
		int num=1;
		for(int i=1;i<=terms;i++)
		{
			System.out.println(num+" ");
			num=(num+2)+i;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num(5);
		

	}

}
