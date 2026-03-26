package com.javaprogram;

public class Book
{
	int id;
	String bookName,authorName;
	double price,year;
	
	void setdata(int i, String nm, String atr,double y, double pric)
	{
		id=i;
		bookName=nm;
		authorName=atr;
		year=y;
		price=pric;
	}
	
	void display()
	{
		System.out.println(id);
		System.out.println("bookName "+bookName);
		System.out.println("authorName "+authorName);
		System.out.println("year "+year);
		System.out.println("price "+price);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book();
		b1.setdata(101, "Think and grow rich", "Nepollin Hills", 1990, 256);
		b1.display();
		

	}

}
