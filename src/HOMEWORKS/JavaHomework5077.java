package HOMEWORKS;

import java.util.Scanner;

public class JavaHomework5077 {

	public static void main(String[] args) {

//			Create an array of integers that will store 5 elements taken from a user
//			Don't print any prompt message for the user
//			Then print out all the elements you have created in the first loop in reverse order. 
//
//			Example: 
//			Input: 
//			1
//			2
//			3
//			4
//			5
//			Output:
//			5
//			4
//			3
//			2
//			1
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[5];
		for (int i = 0; i < 5; i++) {
			int number = scan.nextInt();
			numbers[i] = number;
		}
		for (int j = numbers.length - 1; j >= 0; j--) {
			int str = numbers[j];
			System.out.println(str);
		}
	}

}
