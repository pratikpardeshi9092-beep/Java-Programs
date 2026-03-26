package com.do_while_loop;
import java.util.*;
public class Calculator {
		// TODO Auto-generated method stub
		public static void cal()
		{
			Scanner sc=new Scanner(System.in);

			char ch;
			do {
				System.out.println("enter a 1st number:");
				int num1=sc.nextInt();
				System.out.println("enter a 2nd number:");
				int num2=sc.nextInt();

				System.out.println("1:Add");
				System.out.println("2:Sub");
				System.out.println("3:mul");
				System.out.println("4:div");
				System.out.println("5:exit");
				System.out.println("Enter your choice: ");
				int choice=sc.nextInt();
			
				switch(choice) {
				case 1:
				System.out.println(num1+num2);
				break;
				case 2:
				System.out.println(num1-num2);
				break;
				case 3:
				System.out.println(num1*num2);
				break;
				case 4:
				System.out.println(num1/num2);
				break;
				case 5:
				System.out.println("Exit");
				return;
			

			}
			System.out.println("Do you want  continue(y/n)?");
			ch=sc.next().charAt(0);

		}while(ch=='y'||ch=='Y');
	
		
	}
		public static void main(String[] args) 
		{
			cal();
		}
}


