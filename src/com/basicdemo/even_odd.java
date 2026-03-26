package com.basicdemo;
import java.util.*;
public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int i=sc.nextInt();
		if(i%2==0)
		{
			System.out.println(i+" is even ");
			
		}else {
			System.out.println(i+" is odd ");
		}
		

	}

}
