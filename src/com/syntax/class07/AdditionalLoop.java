package com.syntax.class07;

public class AdditionalLoop {

	public static void main(String[] args) {
		// how to print odd numbers from 1 to 20
		int num = 1;
		while (num <= 20) {
			System.out.println(num);
			num += 2;
		}
		System.out.println("____________________");
		// using mod and if

		int num1 = 1;
		while (num1 <= 20) {
			if (num1 % 2 != 0) {
				System.out.println(num1);
			}
			num1++;
		}
		System.out.println("____________________");
		// third way

		int y = 1;
		while (y <= 20) {
			System.out.println(y++);
			y++;
		}
	}

}
