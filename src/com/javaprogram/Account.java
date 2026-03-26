package com.javaprogram;

public class Account {
	int Accno;
	String name;
	double balance;
	public Account(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}
	public void  acc(int accno,String name, double balance)
	{
		this.Accno=accno;
		this.name=name;
		this.balance=balance;
	}
	public void deposite(double amt)
	{
		balance =balance+amt;		
	}
	
	public void  withdraw(double amt)
	{
		balance=balance-amt;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account(101,"om",1000);
		a1.deposite(200);
		a1.withdraw(100);
		System.out.println(a1.balance);
	}

}
