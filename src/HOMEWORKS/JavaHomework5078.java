
package HOMEWORKS;

import java.util.Scanner;

public class JavaHomework5078 {

	public static void main(String[] args) {
//		Create an int array of integers with a size of 5 and input values with Scanner. 
//		Don't print prompt questions for a user.
//		Using loop print out each element of the array that should look like the output below
//
//		Example:
//		Input:
//		1
//		2
//		3
//		4
//		5
//
//		Output:
//		10
//		20
//		30
//		40
//		50
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[5];
		for (int i = 0; i < 5; i++) {
			int number = scan.nextInt();
			numbers[i] = number;
		}
		for (int str : numbers) {
			System.out.println((str*10));
	}
	}
}

