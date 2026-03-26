package com.basicdemo;
import java.util.*;
public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year=sc.nextInt();
		
		if(year%4==0) {
			System.out.println(year+ " is a leap year" );
		}else {
			System.out.println(year+" is not leap year");
		}
		
	}

}
