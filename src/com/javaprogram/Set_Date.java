package com.javaprogram;

public class Set_Date 
{
	private int dd,mm,yy;
	
	public int getDd()
	{
		return dd;
	}
	
	public void setDd(int d)
	{
		dd=d;
	}
	
	public int setMm()
	{
		return mm;
	}
	public void getMm(int m)
	{
		mm=m;
	}
	
	public int setYy()
	{
		return yy;
	}
	public void getYy(int y)
	{
		yy=y;
	}
	
	public void setdata(int d, int m, int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	
	public void  display()
	{
		System.out.println("Date is "+ dd+"/"+mm+"/"+yy);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set_Date a1=new Set_Date();
		a1.setdata(3, 1, 2003);
		a1.display();

	}

}
