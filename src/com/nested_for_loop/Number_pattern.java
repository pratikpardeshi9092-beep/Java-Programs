package com.nested_for_loop;

public class Number_pattern {
	
	public static void num(int num) {
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("1");
			}
			System.out.println();

		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num(5);
		
		
	

	}

}
