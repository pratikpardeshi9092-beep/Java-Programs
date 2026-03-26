package com.whileloop;

public class Prime_num_1_to_100 {
	public static void  prime(int num)
	{
		int i=2;
		int cnt=0;
		while(i<=num/2)
		{
			if(num%i==0)
			{
				cnt++;
				break;
			}
			i++;
		}
	
		if(cnt==0)
		{
			System.out.println(num+" ");
		}
	}
		public static void primeno()
		{
			int num=1;
			while(num<=100)
			{
				prime(num);
				num++;
			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeno();
	}

}
