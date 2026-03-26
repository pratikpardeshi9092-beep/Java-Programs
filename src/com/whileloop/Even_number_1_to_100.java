//Display all even numbers from 1 to 100

package com.whileloop;

public class Even_number_1_to_100 {
	public static void num()
	{
		int i=1;
		while(i<=100)
		{
			if(i%2==0)
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
