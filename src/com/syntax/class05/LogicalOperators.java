package com.syntax.class05;

public class LogicalOperators {

	public static void main(String[] args) {
		// AND,OR,NOT
		// AND ==> &&
//		if(true && true)--> true
//		if(true&&false)--> false		
//		if(false&&false)--> false
//		if(false&&false)--> false
// 				
//		OR ||
//		if(false&&false)--> false
//		
//	}

		/*
		 * if declared number us between 1-10-->this number is small between 11-100-->
		 * this is a big number between 101-1000--> this is a large number
		 */

		int num = 78;

		if (num >= 1 && num <= 10) {
			System.out.println("this number is small");

		} else if (num > 10 && num <= 100) {
			System.out.println("this is a big number");

		} else if (num > 100 && num <= 1000) {
			System.out.println("this is a large number");
		} else {
			System.out.println("Number is super large");
		}
System.out.println("_______________________________ ");
		int num1 = 1200;

		if (num1 >= 1 && num1 <= 10) {
			System.out.println("this number is small");

		} else if (num1 > 10 && num1 <= 100) {
			System.out.println("this is a big number");

		} else if (num1 > 100 && num1 <= 1000) {
			System.out.println("this is a large number");
		} else {
			System.out.println("Number is super large");
		}
	}
}
