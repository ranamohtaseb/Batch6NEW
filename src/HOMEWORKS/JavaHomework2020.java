package HOMEWORKS;

import java.util.Scanner;

public class JavaHomework2020 {
	public static void main(String[] args) {
		
		//Write  a program that takes user's first name and surname and prints in console
		//Instruct the user to enter first name: "Please Enter First Name"
		//Capture the first name
		//Instruct the user to enter surname:"Please Enter Surname" 
		//Capture surname
		//Print first name and surname
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter First Name");
		
		String name=scan.next();
		System.out.println("Please Enter Surname?");
		String surname=scan.next();
		System.out.println(name+" "+surname);
		
		
		
	}

}
