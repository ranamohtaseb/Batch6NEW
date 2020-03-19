package com.syntax.calss04;

public class MoreNestedIf {

	public static void main(String[] args) {
		// declare date and day.
		// if day is Friday-->if date is 13--> watch a scary movie
		//if day is Friday-->date not 13--> watch a comedy
		
		boolean isFriday=true;
		int date=14;
		
		if (isFriday) {
			System.out.println("Today is Friday, I am going to the movies");
			if (date==13) {
				System.out.println("I'll watch a scary movie");
			} else {
				System.out.println("I'll watch a comedy");
			}
	    } else {
	    	System.out.println("Today is not Friday, I am staying home");
	    
		}
		}
		
}