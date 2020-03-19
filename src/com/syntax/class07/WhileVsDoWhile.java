package com.syntax.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//hello 5 times
		int num = 1;

		while (num <= 5) {
			System.out.println("Hello");
			num++;

		}
		System.out.println("_____________Using Do While Loop ______________");
		// hello 5 times, do something while the condition is true

		int num1 = 1;

		do {
			System.out.println("Hello");
			num1++;
		} while (num1 <= 5);

		// when number is 11, it will print once because of the do.
		// and since the condition is false, it will stop printing

		System.out.println("________Using Do While Loop 2 When the condition is false_________");
		int num2 = 11;

		do {
			System.out.println("Hello");
			num2++;
		} while (num2 <= 5);

	}

}
