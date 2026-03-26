package com.javaprogram;

public class Employee 
{
	int eid;
	String name,email;
	double basicsal, pf, hra,da,netsal;
	
	void setdata(int id, String nm, String eml, double bsal)
	{
		eid=id;
		name=nm;
		email=eml;
		basicsal=bsal;
	}
	
	void display()
	{
		System.out.println(eid);
		System.out.println(name);
		System.out.println(email);
		System.out.println(basicsal);
		System.out.println(pf);
		System.out.println(hra);
		System.out.println(da);
		System.out.println(netsal);
		System.out.println("------------------------------------------------------");

	}
	
	void calsal()
	{
		pf=0.07*basicsal;
		hra=0.10*basicsal;
		da=0.15*basicsal;
		netsal=basicsal-pf+hra+da;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("i am in main");
		Employee e1=new Employee();
		e1.display();
		e1.setdata(101, "om"," a@gmail.com", 12000);
		e1.calsal();
		e1.display();
		
		Employee e2=new Employee();
		e2.setdata(102, "ram", "a@gmail.com", 20000);
		e2.display();


	}

}
