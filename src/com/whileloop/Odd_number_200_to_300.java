//Display all odd numbers from 200 to 300. 
package com.whileloop;

public class Odd_number_200_to_300 {
	public static void num()
	{
		int i=200;
		while(i<=300)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				
			}
			i++;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num();

	}

}
