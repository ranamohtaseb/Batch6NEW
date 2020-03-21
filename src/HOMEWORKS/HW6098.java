package HOMEWORKS;

import java.util.Scanner;

public class HW6098 {

	public static void main(String[] args) {
//		String word;
//
//		Write a for loop that will print out every other letter in a String, 
		//starting with the first letter.  
		//These letters should be printed all on one line with no space in between.
//
//		Sample input/outputs
//		In: hello
//		hlo
//
//		In: SSyynnttaaxxTTeecchhnnoollooggiieess
//		SyntaxTechnologies
//		 
		 Scanner inp = new Scanner(System.in);
		 System.out.print("In:");
		 String word = inp.nextLine();
		 
		word = word.replace(" ", "").trim();
		for (int i = 0; i <= word.length() - 1; i += 2) {
			String word1 = word.charAt(i) + "";
			System.out.print(word1);
		 }
	}
}
