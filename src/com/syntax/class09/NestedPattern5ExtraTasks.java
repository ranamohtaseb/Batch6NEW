package com.syntax.class09;

public class NestedPattern5ExtraTasks {

	public static void main(String[] args) {
		// Print downward trianlgel of numbers
//		Print the following pattern:
//			55555
//			4444
//			333
//			22
//			1  
//

		for (int r = 5; r >= 1; r--) {
			for (int c = 1; c <= r; c++) {
				System.out.print(r);
			}
			System.out.println();
		}
		System.out.println("_______Print the following pattern____________");
		// *
		// **
		// ***
		// ****
		// *****
		// ****
		// ***
		// **
		// *

		for (int r = 1; r <= 5; r++) {
			// inner loop depends on outer loop
			for (int c = 1; c <= r; c++) {
				// the space after the * is only to make it look nice and spreadout
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		for (int r = 4; r >= 1; r--) {
			// inner loop depends on outer loop
			for (int c = 1; c <= r; c++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
