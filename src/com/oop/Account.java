package com.oop;

public class Account {
		int accno;
		double balance;
		
		Account()
		{
			balance=0;
			System.out.println("default constructor");

		}
		void acc(int accno,double balance )
		{
			this.accno=accno;
			this.balance=balance;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
