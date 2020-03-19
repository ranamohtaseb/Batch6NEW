package HOMEWORKS;

import java.util.Scanner;

public class JavaHomework2032 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = scan.nextInt();
		if (age > 25) {
			System.out.println("Please enter your gender:M or F");
			String gender = scan.next();
			if (gender.equals("M")) {
				System.out.println("Man");
			} else if (gender.contentEquals("F")) {
				System.out.println("Woman");
			}
		} else {
			System.out.println("Please enter your gender:M or F");
			String gender = scan.next();
			if (gender.equals("M")) {
				System.out.println("boy");
			} else if (gender.contentEquals("F")) {
				System.out.println("girl");
			}
		}
	}
}

