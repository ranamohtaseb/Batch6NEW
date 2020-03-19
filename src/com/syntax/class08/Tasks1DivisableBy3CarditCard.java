package com.syntax.class08;

import java.util.Scanner;

public class Tasks1DivisableBy3CarditCard {

	public static void main(String[] args) {

//		Task1:Print numbers from 1 to 50 except those that are divisible by 3
//		Task2:Create a program that will be asking user to apply for a credit card 10 times. 
//		As soon you get an “yes” from a user program should stop asking.

		// Task1:


		for (int i = 1; i <= 50; i++) {
			if ((i % 3) == 0) {
				continue;
			}
		System.out.println(i);
	}

		 

		//Task2:
		 Scanner scan;
		 String a="Yes";
		 scan=new Scanner(System.in);
		 for(int i=1; i<=10; i++) {
			System.out.println("Do you want to apply for a credit card?");
			a=scan.nextLine();
			if(a.equals("Yes")) {
				System.out.println("Congratulations");
				break;
			}
		 }
}}
