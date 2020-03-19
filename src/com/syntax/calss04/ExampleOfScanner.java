package com.syntax.calss04;

import java.util.Scanner;

public class ExampleOfScanner {

	public static void main(String[] args) {
		
Scanner scan=new Scanner(System.in);
        System.out.println("Please enter any text");
		String text=scan.nextLine();
		
		System.out.println(text);
		System.out.println("Please enter any number");
		int number=scan.nextInt();
		System.out.println("end of the program");
		
		int number2=scan.nextInt();
		// if you will insert numbers --> nextInt
		//if you will insert one word with no spacing --> next
		//if you will insert words with spacing --> nextL
		
		
	}

}
