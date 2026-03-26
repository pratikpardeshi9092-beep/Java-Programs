package com.basicdemo;
import java.util.*;
public class Positive_negative_number 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int i=sc.nextInt();
		
		if(i>=0)
		{
			System.out.println(i+ " it is Positive ");

		}else
		{
			System.out.println(i+" it's Negative ");

		}

	}

}
