package ExtraTasks;

import java.util.Scanner;

public class CreditcardPractice02252020 {

	public static void main(String[] args) {

//		Create a Java program that will ask if user has a
//		   credit card or not. If you user does not have a
//		  credit card then offer them. If they do have one
//		  ask what is balance on the card? If balance of
//		  the card is larger than 1000, tell them to pay
//		off
//		    immediately, otherwise you can tell them that
//		  they can spend more.

		Scanner scan;
		boolean creditCard;
		int balance;

		scan = new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		creditCard=scan.nextBoolean();
		if (creditCard) {
			System.out.println("What is your balance?");
			balance=scan.nextInt();
			if (balance > 1000) {
				System.out.println("Please pay off balence immeduately");
			} else if (balance<1000) {
				System.out.println("You can spend more");
			}
		} else {
			System.out.println("please get a credit card");
		}
	}

}
