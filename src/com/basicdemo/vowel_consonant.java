package com.basicdemo;
import java .util.*;
public class vowel_consonant 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
		
		if(ch>='a' && ch<='z')
		{
			if(ch=='a' || ch =='e' || ch== 'i'|| ch=='o' || ch== 'u')
			{
				System.out.println("it is vowel");
			}else {
				System.out.println("it is character");
			}
					
		}else 
		{
			System.out.println("it is invalid input");
		}
		

	}

}
