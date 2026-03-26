package com.forloop;
import java.util.*;
public class Table {
	public static void printtable(int no) {
		for(int i=1;i<=10;i++)
		{
			int table=i*no;
			System.out.println(table);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int i= sc.nextInt();
		printtable(i);
;		
	}

}
