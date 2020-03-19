package HOMEWORKS;

import java.util.Scanner;

public class JavaHomework3045 {

	public static void main(String[] args) {
//		Ask the user to enter any number from 1-7.
//		Based on the number define the day of the week
//
//
//		Example Output:
//		Input a number between 1-7
//		Friday
//
//		Example Output:
//		Input a number between 1-7
//		Invalid
		Scanner scan;
		int number;
		String day;
		
		scan=new Scanner(System.in);
		System.out.println("Input a number between 1-7");
		number=scan.nextInt();
		
		switch (number) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
			break;
		default:
			day = "Invalid";
			break;
		}
	System.out.println(day);	
		
	}

}
