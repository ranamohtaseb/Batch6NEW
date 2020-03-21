package HOMEWORKS;

import java.util.Scanner;

public class HW6092 {

	public static void main(String[] args) {
//		Using Scanner class input string value. 
//		Print out the following: "The first 3 letters of ___ is ___"
//
//		For example, if the input is "banana", 
		//your output should be: "The first 3 letters of banana is ban".

		Scanner scan=new Scanner(System.in);
		//System.out.println("Please enter one word");
		String input=scan.nextLine();
		 
		String threeLetters=input.substring(0, 3);
		System.out.println("the first 3 letters of "+input+" is "+threeLetters);
	
	}

}
