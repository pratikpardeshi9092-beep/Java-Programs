package com.has_a_relationship;

public class UseEmphierarchy {
	
		public static void main(String args[])
	{
			Employee e=new Manager(101,"om",67000,new MyDat(1,1,2000),7,100000);
			e.calculatesal();
			double b=((Manager)e).getBonus();
			System.out.println("Manager bonus is "+b);

	}

}
