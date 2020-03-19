package com.syntax.calss04;

import java.util.Scanner;

public class ScannerTaskInClass02162020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// You are a loan officer, you need to ask the client the laon amout
		// If loan is less or equal to 200000, "you are approved"
		// otherwise, "you are rejected"
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the loan amount you need");

		int num1 = input.nextInt();

		System.out.println(num1);

		if (num1 <= 200000) {
			System.out.println("You are approved to get the loan");

		} else {
			System.out.println("you are rejected");
		}

		// you are DMV rep
		// ask customer their age. if they are 18 and older, "you can issue drivers
		// otherwise you will offer them to get a learners permit.

		int age=input.nextInt();
		System.out.println("What is your age?");
		if (age>=18) {
			System.out.println("you can issue drivers");
		}else {
			System.out.println(" Please get a learners permit");
		}
		
	}

}
