package com.forloop;
import java.util.*;
public class Multiplication_of_digit {
	public static int digit(int num)
	{
		int mul=1;
		for(int i=num;i!=0;i=i/10)
		{
			int digit=i%10;
			System.out.println("digit: "+digit);
			mul=mul*digit;
		}
		return mul;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int mul=digit(num);
		System.out.println(mul);



		

	}

}
