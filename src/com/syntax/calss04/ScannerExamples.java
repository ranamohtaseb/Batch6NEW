package com.syntax.calss04;

import java.util.Scanner;

public class ScannerExamples {

	public static void main(String[] args) {
		// Capture name from a user and
		//print in the format
		//My name is_______
//1. Bring Scanner class into a program
		//System.in--> Identifies keyboard
Scanner scan=new Scanner(System.in);
// Instruct user f what program expects
System.out.println("Please enter your name");

//capture line of Strings from a user
String name=scan.nextLine();
System.out.println("Hello "+name);

//Instruct user of what program expects
System.out.println("How old are you?");
//capture number from a user
int age=scan.nextInt();

System.out.println("I am "+name+ ", I am "+age+" years old!");
	}

}
