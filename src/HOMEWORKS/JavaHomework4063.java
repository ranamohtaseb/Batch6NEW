package HOMEWORKS;

import java.util.Scanner;

public class JavaHomework4063 {

	public static void main(String[] args) {
//		Given the following inputs:
//			int x;
//
//			Write a for loop that will print out a series of numbers 
//		starting at 0 and ending at the x(value must be taken from a user), exclusive.
//
//			Example Output:
//			In: 3
//			0 1 2
//
//			In: 8
//			0 1 2 3 4 5 6 7
//
//			In: 5
//			0 1 2 3 4

		Scanner inp;
		inp=new Scanner(System.in);

		System.out.println("In: ");
		int entry=inp.nextInt();
		for (int x=0; x<entry;x++) {
			System.out.print(" "+x);
		
		}}}	