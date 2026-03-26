package com.basicdemo;
import java.util.*;
public class Electricity_bill
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elecricity bill: ");
		float unit=sc.nextFloat();
		float bill,rate,charges,finalbill;
		if(unit<=50) {
			rate=0.50f;
			bill=unit*rate;
		}
		else if (unit<=150)
		{
			rate=0.75f;
			bill=unit*rate;
			
		}else if (unit<=150)
		{
			rate=0.75f;
			bill=50*0.50f*100*0.75f*(unit-150)*rate;
		}else if (unit<=250)
		{
			rate=1.20f;
			bill=50f*050f+100*0.75f+(unit-150)*rate;
			}else 
			{
				rate=1.50f;
				bill=50*0.50f+100*0.75f+100*1.20f+(unit-250)*rate;
				
			}
		System.out.println("bill is:  "+bill);
		charges=bill/100*20;
		System.out.println("charges 20%: "+charges);
		bill=bill+charges;
		System.out.println("bill of electricity is: "+bill);
		

	}

}
