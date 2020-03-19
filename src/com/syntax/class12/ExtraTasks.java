package com.syntax.class12;

import java.util.Scanner;

public class ExtraTasks {

	public static void main(String[] args) {
// task 1
		//Create a String and print it in reverse order (Sunday → yadnuS).
		String str = "Sunday";
		char reverse;
		for (int i = str.length() - 1; i > -1; i--) {
			reverse = str.charAt(i);
			System.out.print(reverse);
		}
		System.out.println();

// task 2
		//Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of character
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string please :");
		String text = input.nextLine();
		if (!text.isEmpty()) {
			if (text.length() % 2 == 1 && text.length() >= 3) {
				System.out.println(text.charAt((text.length()) / 2));
			} else {
				System.out.println("Even number of characters");
			}
		}
		
// task 3
		
//Write a program that reads two people’s first names and if they expecting boy or girl?
//Based on the input suggests a name for a baby:
//Example Output:
//Mom’s first name? Mary
//Dad’s first name? Daniel
//Boy or Girl? boy
//Suggested baby name: DANRY
//
//Example Output:
//Mom’s first name? Mary
//Dad’s first name? Daniel
//Boy or Girl? girl
//Suggested baby name: MAIEL
		Scanner scan = new Scanner(System.in);
		System.out.println("What is Mom's first name");
		String name1 = scan.nextLine();

		System.out.println("What is Dad's first name");
		String name2 = scan.nextLine();

		System.out.println("Boy or Girl");
		String babyName = scan.nextLine();

		String SuggestedBName = null;
		int half1 = name1.length() / 2;
		int half2 = name2.length() / 2;
		if (babyName.equalsIgnoreCase("Girl")) {
			SuggestedBName = name1.substring(0, half1) + name2.substring(half2);
			System.out.println(SuggestedBName);
		} else if (babyName.equalsIgnoreCase("Boy")) {
			SuggestedBName = name2.substring(0, half2) + name1.substring(half1);
			System.out.println(SuggestedBName);
		}
	}
}
