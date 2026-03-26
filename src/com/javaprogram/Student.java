package com.javaprogram;

public class Student
{
	int rollno;
	String name;
	double math, science, aiml,iot,dsa,percentage, total;
	
	
	
	public  void setdata(int r, String n, double m,double s,double a,double i,double d )
		{
			rollno=r;
			name=n;
			math=m;
			science=s;
			aiml=a;
			iot=i;
			dsa=d;
		}
		
		public void cal()
		{
			total=math+science+aiml+iot+dsa;
			percentage=(total/500)*100;
		}
		
		public void display()
		{
			System.out.println(rollno);
			System.out.println(name);

			System.out.println(math);
			System.out.println(science);

			System.out.println(aiml);
			System.out.println(iot);
			System.out.println(dsa);
			System.out.println("total "+total);
			
			System.out.println("per "+percentage);

			
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setdata(1, "om", 92, 90, 98,95, 94);
		s1.cal();
		s1.display();

	}

}
