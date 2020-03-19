package com.syntax.class08;

import java.util.Scanner;

public class InClassTasksScanneroddEven {

	public static void main(String[] args) {
// Task3:Write a program that reads a range of integers (start and end point), 
//provided by a user and then from that range prints the sum of the even and odd integers.
//
//Task4Write a program to ask a user to enter item they want to buy and the price of that item. 
//Every time user enters money accumulate the amount and tell the user how much is left to pay 
//off the amount. If user give more money program should return a change. 
//Whenever a user done with payments program should say “Thank you for shopping!”		

		// Task3:

		Scanner scan;

		int sumodd = 0;
		int sumeven = 0;

		scan = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		int min = scan.nextInt();
		int max = scan.nextInt();

		for (int i = min; i <= max; i++) {
			if (i % 2 == 0) {
				sumeven = sumeven + i;
			} else {
				sumodd = sumodd + i;
			}
		}
		System.out.println("total of even numbers between " +min+" to "+max+" "+ sumeven);
		System.out.println("total of even numbers between " +min+" to "+max+" "+ sumodd);

	}

}
