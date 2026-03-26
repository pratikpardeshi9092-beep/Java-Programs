package com.switchcase;
import java.util.*;

public class Operator
{
	public static void num()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b=sc.nextInt();
		
		System.out.println("Enter operator(+,-,*,/) ");
		char op=sc.next().charAt(0);
		
		switch(op)
		{
		case '+':
			System.out.println("Addition= "+(a+b));
			break;
			
		case '-':
			System.out.println("sub= "+(a-b));
			break;
			
		case '*':
			System.out.println("mul= "+(a*b));
			break;

		case '/':
			System.out.println("div= "+(a/b));
			break;
			
		default:
			System.out.println("Invalid input");
		}

	
	}
		public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		num();
	}

}
