package com.forloop;

public class Average_of_1st_10_number
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int sum=0;
		int count=10;
		
		for(int i=1;i<=10;i++)
		{
			sum=sum+i;
			
		}
		double avg=(double)sum/count;
		System.out.println("Avg of 1st 10 no.: "+avg);

	}

}
