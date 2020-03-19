package ExtraTasks;

import java.util.Scanner;

public class GradeSwitchClass0602232020 {

	public static void main(String[] args) {
		
//Allow user to enter grade and then provide
//explanation: A-Excellent, B-Good, C-Average,
//D-Bad, any other grade --> Not Acceptable. At the
//end your program should print which grade was
//entered by a user with explanation.
	
		Scanner scan;
		char grade;
		String explanation;
		
		scan=new Scanner(System.in);
		System.out.println("please enter your grade");
		grade=scan.next().charAt(0);
		switch(grade) {
		case ('A'):
			explanation= "Excellent";
		break;
		case ('B'):
			explanation="Good";
		break;
		case ('C'):
			explanation="Average";
		break;
		case('D'):
			explanation="Bad";
		default:
			explanation="Not Acceptable";
					  	
		}
		System.out.println("Your grade is "+grade+" and you're performance is "+explanation);
		
	}

}
