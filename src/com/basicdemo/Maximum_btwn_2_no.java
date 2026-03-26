package com.basicdemo;
import java.util.*;
public class Maximum_btwn_2_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number a: ");
		int a=sc.nextInt();
		System.out.println("Enter a number b: ");
		int b=sc.nextInt();
		if(a>=b && b>=a) {
			System.out.println(a+"  is greater");
			
		}else {
			System.out.println(b+"  is greater");
			
		}
	}

}
