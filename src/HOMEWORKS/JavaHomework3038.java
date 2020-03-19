package HOMEWORKS;

import java.util.Scanner;

public class JavaHomework3038 {

	public static void main(String[] args) {

//		Prompt user with a question: "Is it weekend?"
//			If it is not a weekend --> subject="Manual testing"
//			Otherwise --> subject="Java"
//
//			Output: 
//			"Today you will be learning ____"
	
	
		Scanner scan;
		boolean weekend;
		String subject;
		scan = new Scanner(System.in);
		System.out.println("Is it weekend?");
		weekend = scan.nextBoolean();
		if (!weekend) {
			subject = "Manual testing";
		} else {
			subject = "Java";

		}
		System.out.println("Today you will be learning " + subject);

	}

}
