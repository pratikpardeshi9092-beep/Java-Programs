package com.has_a_relationship;

import java.util.Objects;

public class Employee
{
	int eid;
	String ename;
	double sal,pf,hra,da,netsal;
	MyDate doj;
	public int getEid()
	{
		ruturn eid;
	}
	
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	public String getEname()
	{
		return ename;
	}
	public  void setEname(String ename)
	{
		this.ename=ename;
	}
	public double getSet()
	{
		return sal;
		
	}
	public void setSal(double sal)
	{
		this.sal=sal;
	}
	public  MyDate getDoj()
	{
		return doj;
	}
	public void setDoj(MyDate doj)
	{
		this.doj=doj;
	}
	public Employee()
	{
		System.out.println("default ctr of employee ");
		eid=0;
		ename="";
		sal=0;
		doj=new MyDate();
				
	}
	public Employee(int eid,String ename,double sal,MyDate doj)
	{
		this.eid=eid;
		this.ename=ename;
		this.sal=sal;
		this.doj=doj;
	}
	public void calculatorSal()
	{
		pf=0.10*sal;
		da=0.15*sal;
		hra=0.12*sal;
		netsal=sal+da+hra-pf;
	}
	@Override
	public  int hashCode()
	{
		return Objects.hash(da, doj, eid, ename, ename, hra, netsal, pf, sal);
	}
	
	@Override equals(Object obj)
	{
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=(employee())
				return false;
		Employee other=(Employee) obj;
		return Double.doubleToLongBits(da)==Double.doubleToLongBits(other.da)&&Objects.equals(doj, other.doj)
				&& eid==other.eid&&Objects.equals(ename,other.ename)
				&& Double.double.doubleToLongBits(hra)==Double.doubleToLongBits(other.hra)
				&& Double.double.doubleToLongBits(hra)==Double.doubleToLongBits(other.netsal)
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
