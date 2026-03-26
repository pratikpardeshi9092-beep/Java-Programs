package com.switchcase;

import java.util.Scanner;

public class Calculator {
	public static void cal()
	{
		Scanner sc=new Scanner(System.in);
		for(;;)
		{
			System.out.println("Enter 1st number: ");
			int n1=sc.nextInt();
			System.out.println("enter 2nd number: ");
			int n2=sc.nextInt();
			System.out.println(" Operation: ");
			System.out.println("1: Addition: ");
			System.out.println("2:Sub: ");
			System.out.println("3:Exit: ");
			System.out.println("enter your choice: ");
			int op=sc.nextInt();
			int res=0;
			switch(op)
			{
			case 1:
				res=n1+n2;
					break;
			case 2:
				res=n1-n2;
				break;	
			case 3:
				System.exit(0);
				
			
			}
			System.out.println("Result is: "+res);
			System.out.println("Do you want to continue.....(Y/N): ");
			char ch=sc.next().charAt(0);
			if(ch=='N' || ch=='n')
				break;
		}
		System.out.println("Thank you for using calculator: ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cal();

	}

}
