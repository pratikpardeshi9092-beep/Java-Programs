package com.forloop;
import java.util.*;
public class Factorial {
	
	
	public static void factorial(int num)
	{
		int fact=1;	
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is: "+fact);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		factorial(num);

	}

}
