package com.basicdemo;
import java.util.*;
public class Swapnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no.: ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd no.: ");
		int b=sc.nextInt();
		
		int temp ;
		 temp = a; 
		 a = b;
		 b = temp;
		 
		 System.out.println("a = "+a);
		 System.out.println("b = "+b);

	}

}
