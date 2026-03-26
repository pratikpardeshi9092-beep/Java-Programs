package com.inheritance;

public class Saving_Account extends Account 
{
	double intrestrate;
	
	public void Saving_Account()
	{
		
		intrestrate=0;
	}
	public void Acc(int accno, String name, double balance)
	{
		super(Saving_Account);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
