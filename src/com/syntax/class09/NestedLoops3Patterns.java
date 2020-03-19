package com.syntax.class09;

public class NestedLoops3Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//*****
		for (int a = 1; a <= 5; a++) {
			System.out.print("*");
		}
		System.out.println("_____________");
// *
// *
// *
// *
// *
		for (int a = 1; a <= 5; a++) {
			System.out.println("*");
		}
		System.out.println("________Printing patterns using nested loops_________");

//Printing patterns using nested loops
// x in rows, y is columns
		for (int x = 1; x <= 4; x++) {
			for (int y = 1; y <= 5; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("______Printing 10x10 pattern_________");
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("______Printing 5x10 pattern using x=1_________");
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= 10; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("______Printing 5x10 pattern usig x=0_________");
		for (int x = 0; x < 5; x++) {
			for (int y = 0; y < 5; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("_____12345 over 5 lines/rows"
				+ "_________");
		for (int x = 1; x <=5; x++) {
			for (int y = 1; y <= 5; y++) {
				System.out.print(y);

			}
			System.out.println();

			
		}
		System.out.println("_____11111,22222 over 5 lines/rows_________");
		for (int x = 1; x <=5; x++) {
			for (int y = 1; y <= 5; y++) {
				System.out.print(x);

			}
			System.out.println();

			
		}
		System.out.println("_____123456789 over 5 lines/rows_________");
		for (int x = 1; x <=5; x++) {
			for (int y = 1; y <= 9; y++) {
				System.out.print(y);

			}
			System.out.println();
	}
		System.out.println("______54321 over 5 rows_____________");
		for (int x = 1; x <=5; x++) {
			for (int y = 5; y >= 1; y--) {
				System.out.print(y);

			}
			System.out.println();	
		
	}
		System.out.println("______55555,44444, over 5 rows_____________");
		for (int x = 1; x <=5; x++) {
			for (int y = 5; y >= 1; y--) {
				System.out.print(x);

			}
			System.out.println();	
		
	}
	}}

