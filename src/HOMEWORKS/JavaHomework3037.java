package HOMEWORKS;

import java.util.Scanner;

public class JavaHomework3037 {

	public static void main(String[] args) {
//		Take 2 boolean inputs from a user:
//			 
//			"Are you thirsty?"
//			"Are you sleepy?"
//
//			If user is thirsty and not sleepy--> drink=Water
//			If user is thirsty and sleepy--> drink=Coffee
//			If user is not thirsty and sleepy --> drink=Tea
//			Otherwise drink="Nothing"
//
//			Output:
//			"Looks like you need ___ "

		Scanner scan;
		boolean thirsty, sleepy;
		String drink;
		scan = new Scanner(System.in);
		System.out.println("Are you thirsty?");
		thirsty = scan.nextBoolean();
		System.out.println("Are you sleepy?");
		sleepy = scan.nextBoolean();
		if (thirsty && sleepy) {
			drink = "to drink Coffee";
		} else if (thirsty && !sleepy) {
			drink="to drink Water";
		} else if (!thirsty && sleepy) {
			drink="to drink Tea";
	
		} else {
			drink="to drink Nothing";
	
		}
		System.out.println("Looks like you need "+drink);

	}

}
