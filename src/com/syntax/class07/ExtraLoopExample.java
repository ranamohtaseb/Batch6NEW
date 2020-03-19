package com.syntax.class07;

import java.util.Scanner;

public class ExtraLoopExample {

	// we are playing a lottery and a lucky number is 17
	// we want to keep asking user an number from 1-20
	// until he guesses the lucky number the output will be "Congratulations"

	public static void main(String[] args) {
		int n = 1;
		Scanner scan = new Scanner(System.in);
		while (n <= 20) {
			System.out.println("Please enter a lucky number between 1 and 20:");
			n++;
			n = scan.nextInt();
			if (n == 17) {
				System.out.println("CONGRATULATIONS");
				break;
			}
		}

	}

}
