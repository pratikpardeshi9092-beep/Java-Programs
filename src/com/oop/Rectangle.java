package com.oop;
import com.isa.Printable;
public class Rectangle extends Myshape1 implements Printable
{
	


	private int len,bred,ans;
	public Rectangle() {
		len=4;
		bred=3;
	}
	@Override
	public void area()
	{
		ans=len*bred;
	}
	
	public void print()
	{
		System.out.println("Rectangele"+ans);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle q1=new Rectangle();
		q1.area();
		q1.print();
		

	}

}
