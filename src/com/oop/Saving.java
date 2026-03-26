package com.oop;

public class Saving extends Account {
	double intrestRate;

	Saving()
	{
		intrestRate=0;
	}
	
	void savingacc()
	{
		super();
		intrestRate=0;
	}
	
	void savingacc(int accno,String name,double balance)
	{
		super(accno,name,balance);
		double rate;
		intrestRate=rate;
	}
	
	void cal()
	{
		double balance = 0;
		double intrest =balance*intrestRate/100;
		balance=balance+intrest;
		System.out.println("intrest(saving acc)="+intrest);
	}
	
	public void String toString()
	{
		return "savingacc["+super.toString()+",intrestRate="+intrestRate +"]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saving q1=new Saving();
		q1.cal();

	}

}
