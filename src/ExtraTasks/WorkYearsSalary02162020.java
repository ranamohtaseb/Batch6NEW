package ExtraTasks;

import java.util.Scanner;

public class WorkYearsSalary02162020 {

	public static void main(String[] args) {
//		Write a program to ask user to enter numbers of worked years and annual salary. 
//		If user worked for more or equals to 5 years than user is eligible for the bonus, 
//		otherwise he is not.
//		Once user is eligible and salary is larger than 50000 than bonus = 5000, 
//      otherwise bonus=3000.
		Scanner scan = new Scanner(System.in);
		System.out.println("what is your years of expeience?");
		int years = scan.nextInt();
		if (years >= 5) {
			System.out.println("What is your annual income?");
			int income = scan.nextInt();
			if (income > 50000) {
				System.out.println("You are not eligible for $5000 bonus!");
			} else {
				System.out.println("You are not eligible for $3000 bonus!");
			}
		} else {
			System.out.println("You are not eligible for bonus");
		}
	}
}
 