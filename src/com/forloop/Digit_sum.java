package com.forloop;
import java.util.*;
public class Digit_sum {
	
	public static int digit(int num)
	{
		int sum=0;
		for(int i=num;i!=0;i=i/10)
		{
			int digit=i%10;
			System.out.println("Digit: "+digit);
			sum=sum+digit;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		int sum=digit(num);
		System.out.println("sum of digit is: "+sum);

				

		

	}

}
