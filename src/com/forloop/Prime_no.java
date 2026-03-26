package com.forloop;

public class Prime_no {

	public static void primeno(int num) {
		int cnt = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				cnt++;

			}

		}
		if (cnt == 0) {
			System.out.println(num + " is Prime no.");

		} else {
			System.out.println(num + " is not Prime no.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeno(13);
		primeno(54);
		primeno(143);
		primeno(183);


	}

}
