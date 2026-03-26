package com.switchcase;
import java.util.*;
public class Day_of_month
{
	public static void day()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter day number:(1-7): ");
		int day=sc.nextInt();
		
		switch(day)
		{
		case 1:
		System.out.println("sunday: ");
		break;
		
		case 2:
			System.out.println("Monday: ");
			break;
		case 3:
			System.out.println("tuesday: ");
			break;
		
		case 4:
			System.out.println("Wednesday: ");
			break;
			
		case 5:
			System.out.println("Thursday: ");
			break;
			
		case 6:
			System.out.println("Friday: ");
			break;
			
		case 7:
			System.out.println("Saturday: ");
			break;	
			
		default:
			System.out.println("invalid day number ");
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day();
	}

}
