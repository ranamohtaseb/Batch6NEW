
package HOMEWORKS;

public class JavaHomework5069 {

	public static void main(String[] args) {
//		Write a program to print out the pattern: 
//
//			1 2 3 4 5 6 7 
//			1 2 3 4 5 6 
//			1 2 3 4 5 
//			1 2 3 4 
//			1 2 3 
//			1 2 
//			1 
//			1 2 
//			1 2 3 
//			1 2 3 4 
//			1 2 3 4 5 
//			1 2 3 4 5 6 
//			1 2 3 4 5 6 7
		for (int i = 7; i >= 2; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}
			System.out.println();
		}
		for (int r = 1; r <= 7; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}

	}
}
