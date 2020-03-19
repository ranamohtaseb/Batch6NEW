package HOMEWORKS;

import java.util.Scanner;

public class JavaHomework3042 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program using the switch statement  
//Let us consider there are three students in the class with roll number  
//starting from (101 to 103) if any number other than 101-103 are present display 
//		"Not found Student name: in Class"
//First Output: "enter the roll number of the Child"
//case 101: if roll number is 101 print as "Student name: Ramesh "
//case 102 :if roll number is 102 print as "Student name: Mahesh "
//case 103:if roll number is 103 print as "Student name: Mukesh "
//Other than this roll number  it should print "Not found Student name: in Class"

		Scanner scan;
		int rollNumber;
		String winner;
		scan = new Scanner(System.in);
		System.out.println("enter the roll number of the Child");
		rollNumber = scan.nextInt();
		switch (rollNumber) {
		case 101:
			winner = "Student name: Ramesh";
			break;
		case 102:
			winner = "Student name: Mahesh";
			break;
		case 103:
			winner = "Student name: Mukesh";
			break;
			default:
				winner= "Not found Student name: in Class";
		}
		System.out.println(winner);
	}

}
