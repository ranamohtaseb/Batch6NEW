
package com.syntax.class09;

public class NestedLoopsPatterns4 {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// number of rows = number of columns
		// number of columns can equal or less than number of rows bit it cannot
		// exceed number of rows
		// # of columns depends on # of rows

		for (int r = 1; r <= 4; r++) {
			// inner loop depends on outer loop
			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int r = 1; r <= 4; r++) {
			// inner loop depends on outer loop
			for (int c = 1; c <= r; c++) {
				System.out.print(c);
			}
			System.out.println();
		}

	}
}
