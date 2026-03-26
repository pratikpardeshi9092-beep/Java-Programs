package com.javaprogram;
	public class FinalDemo {
		final int data=11;
		double d;
		FinalDemo()
		{
		}
		FinalDemo(int data)
		{
			
			
		}
		public void show()
		{ 
			
			System.out.println(data);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		   FinalDemo obj=new FinalDemo();
		   obj.show(); //100
		   FinalDemo obj1=new FinalDemo(999);
		   obj1.show(); //999
		   
		   FinalDemo obj2=new FinalDemo(99);
		   obj2.show(); //99
		   
		final  FinalDemo f=new FinalDemo(); 
		f.d=200;
		
		

	

	}

}
