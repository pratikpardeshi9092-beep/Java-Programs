package com.oop;

public class Mydate 
{
	private int dd, mm, yy;
	
	Mydate()
	{
		System.out.println("in default ");
		dd=2;
		mm=3;
		yy=2032;
	}
	
	public Mydate(int dd,int mm,int yy)
	{
		System.out.println("in parametric ");
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;

	}
	
	void setDd(int d)
	{
		dd=d;
	}
	
	public int getDd()
	{
		return dd;
	}
	
	void setMm(int m)
	{
		mm=m;
	}
	
	public int getMm()
	{
		return mm;
	}
	
	void setYy(int y)
	{
		yy=y;
	}
	
	public int getYy()
	{
		return yy;
	}
	
	public void display()
	{
		System.out.println(this.dd+"/"+this.mm+"/"+yy);
		
	}
		void setData(int d, int m, int y)
		{
			dd=d;
			mm=m;
			yy=y;
		}
		
		void addDate(Mydate d1)
		{
			Mydate d=new Mydate();
			d.dd=this.dd+d1.dd;
			d.mm=this.mm+d1.mm;
			d.yy=this.yy+d1.yy;
			System.out.println("add is ");
			d.display();


		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mydate q1=new Mydate();
		q1.display();
		q1.setDd(10);
		
		Mydate q2=new Mydate();

		q2.display();
		
		q2.addDate(q1);

	}

}
