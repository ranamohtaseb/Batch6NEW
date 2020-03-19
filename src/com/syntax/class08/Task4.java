package com.syntax.class08;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// Task4W
		// rite a program to ask a user to enter item they want to buy and the price of
		// that item.
		// Every time user enters money accumulate the amount and tell the user how much
		// is left to pay
		// off the amount. If user give more money program should return a change.
		// Whenever a user done with payments program should say “Thank you for
		// shopping!”

		Scanner s;
		String item;
		double price;
		double money;
		double amount = 0;// when we start the amount will be is zero, then it adds up as user start
							// paying money
		double change;
		double remainingBalance;

		s = new Scanner(System.in);
		System.out.println("What are you buying today?");
		item = s.nextLine();

		System.out.println("What is the price for the " + item);
		price = s.nextDouble();

		do {
			System.out.println("Please give money");
			money = s.nextDouble();
			amount = amount + money;
			if (money < price) {
				remainingBalance = amount - price;
				System.out.println("Please give more " + remainingBalance);
			} else if (money > price) {
				change = amount - price;
				System.out.println("Here is your change " + change);
				break;
			} else {
				System.out.println("Thank you!");
			}

		} while (price != money);
System.out.println("Thank you for shopping!");
	}

}
