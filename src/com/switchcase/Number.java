package com.switchcase;

public class Number 
{
	public static void show(int num)
	{
		
			switch(num)
			{
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			default:
				System.out.println("Wrong Number");
			}
			
		
		
	}

	

	

	
public static void main(String[] args) {
	show(2);
}
}
