package com.forloop;
import java.util.*;
public class Power_of_number {
	
	public static void power(int num,int pow)
	{
		
		
		int result=1;
		
		for(int i=1;i<=pow;i++)
		{
			result=result*num;
		}
		System.out.println(result);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		
		System.out.println("Enter a Power: ");
		int pow= sc.nextInt();
		power(num,pow);
		
			
		}
		

	}


