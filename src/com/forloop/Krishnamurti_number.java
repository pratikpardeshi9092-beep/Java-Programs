package com.forloop;
import java.util.*;
public class Krishnamurti_number {
	public static int fact(int num) 
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}return fact;
	}
	
	public static boolean num(int num)
	{
		boolean flag=true;
		int sum=0;
		for(int i=num;i!=0;i=i/10)
		{
			int digit=i%10;
			sum=sum+fact(digit);
		}
		System.out.println(sum);
		if(num!=sum)
		{
			flag=false;
		
		
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		boolean f=num(num);
		if(f)
		{
			System.out.println(num+" is Krishnamurti number ");

			
		}else {
			System.out.println(num+" is not Krishnamurti number ");

		}
		
	}

}
