package com.has_a_relationship;

import java.util.Objects;

public class My_date {
	
	private int dd,mm,yy;
	public My_date(int dd, int mm, int yy) {
		// TODO Auto-generated constructor stub
	}
	
	public void  MyDate(int dd, int mm, int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public String toString()
	{
		return dd+"/"+mm+"/"+yy;
	}
	public void show()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My_date d1=new My_date(3,1,2005);
		d1.show();
		

	}
	@Override
	public int hashCode() {
		return Objects.hash(dd,mm,yy);
	}
	@Override
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		My_date other=(My_date)obj;
		return dd==other.dd&&mm== other .mm&& yy==other.yy;
	}
	

}
