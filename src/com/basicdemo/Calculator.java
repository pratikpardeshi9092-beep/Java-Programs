package com.basicdemo;

public class Calculator 
{
	public static void cal(int num1,int num2, char operator)
	{
		switch(operator)
		{
			case'+':
				System.out.println("Addition: "+(num1+num2));
				break;
			case'-':
				System.out.println("Substraction: "+(num1-num2));
				break;
			case'*':
				System.out.println("Multiplication: "+(num1*num2));
				break;
			case'/':
				System.out.println("Division: "+(num1/num2));
				break;
			default:
				System.out.println("Wrong operator");
		}
}

	public static void show(int num)
	{
		switch(num)
		{
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default:
			System.out.println("Wrong Number");
		}
		
	
	}
	public static void main(String[] args) {
		show(2);
		cal(20,5,'+');
	}
}


