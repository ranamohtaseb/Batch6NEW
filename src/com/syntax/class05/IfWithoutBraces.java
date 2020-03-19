package com.syntax.class05;

public class IfWithoutBraces {

	public static void main(String[] args) {
		boolean isSaturday=true;
		// if you have only one line to print, you can use the if statement without the braces.
		//However, it is safer to always use the braces
		if(isSaturday)
			System.out.println("We have Java Class");
		else
			System.out.println("No Java Class");

	}

}
