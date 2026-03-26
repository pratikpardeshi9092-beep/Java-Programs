package com.basicdemo;

public class My_date 
{
	private int day, month, year;
	
	public void initdate()
	{
		day=03;
		month=01;
		year=2005;
	}
	
	public  void printdate()
	{
		System.out.println("Date is "+day+"/"+month+"/"+year);
	}
	
	/*public void setdate(int d,int m, int y)
	{
		day=d;
		month=m;
		year=y;
	}*/
	public void setData(int d,int m, int y)
	{
		day=d;
		month=m;
		year=y;
		 
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		My_date m1=new My_date();
		m1.initdate();
		m1.setData(21, 1,2010);
        m1.printdate();

		My_date m2 =new My_date();
		m1.initdate();
		m1.setData(21, 1,2010);

        m1.printdate();

	}

}
