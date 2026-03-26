package com.forloop;
import java.util.*;
public class Max_digit {
	public static int digit(int num)
	{
		int max=0;
		for(int i=num;i!=0;i=i/10)
		{
			int digit=i%10;
			System.out.println(digit);
			if(digit>max)
			{
				max=digit;
				System.out.println(max+" no. is great : ");

			}
		}
		return max ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int max=digit(num);
		System.out.println(max);


	}

}
