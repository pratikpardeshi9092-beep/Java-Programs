package com.oop;

public class Student_Marks {
	
	double m1,m2,m3,m4,m5,percentage,rollno,total;
	String name;
	
	public void setdata(double rn,String nm,double a,double b,double c,double d,double e,double per,double tot)
	{
		rollno=rn;
		name=nm;
		m1=a;
		m2=b;
		m3=c;
		m4=d;
		m5=e;
		percentage=per;
		total=tot;
		
		
}
	void cal()
	{
		total=m1+m2+m3+m4+m5;
		percentage=(total/500)*100;
	}
	
	void display()
	{
		System.out.println("rollno"+rollno);
		System.out.println("name"+name);
		System.out.println("m1"+m1);
		System.out.println("m2"+m2);
		System.out.println("m3"+m3);
		System.out.println("m4"+m4);
		System.out.println("m5"+m5);
		System.out.println("percentage"+percentage);
		System.out.println("total"+total);

		


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Marks q1=new Student_Marks();
		q1.setdata(101, "om", 98, 96, 95, 97, 93, 0, 0);
		q1.cal();
		q1.display();
	}

}
