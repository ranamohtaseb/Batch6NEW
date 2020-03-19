package com.syntax.class07;

import java.util.Scanner;

public class LoopLuckyNumber {

	public static void main(String[] args) {
		// we are playing a lottery and a lucky number is 17
		// we want to keep asking user an number from 1-20
		// until he guesses the lucky number the output will be "Congratulations"

		Scanner scan;
		int number;
		int luckNumber = 17;
		scan = new Scanner(System.in);
		//since we are not sure at what trial the user will get the lucky number, there will be no increment
		// however, the limit is 20 trials
		//when we do not know how many times until the luckynumber or success will happen at what trial number
		// we will use while or do while in that case
		do {
			System.out.println("Please enter any number from 1=20");
			number = scan.nextInt();

		} while (number != luckNumber);
		System.out.println("You got it!!!!");
	}

}
