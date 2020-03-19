package com.syntax.class03;

public class ifCondition {
	public static void main (String[] args) {
		
		//Declare a number and compare if the number is larger than 100
		//if the number is larger than 100--> my number is large
		
		System.out.println("Start coding");
		int num=178;
		//first evaluate the condition , then {print block value}
		if (num>100) {
			System.out.println("my number is large");	
		}
	
		System.out.println("End of the program");
// it will print 3 lines since the condition is true
		
	System.out.println("-----------------------------------------");
	
	
		System.out.println("Start coding");
		int num1=178;
		//first evaluate the condition , then {print}
		if (num1>1000) {
			System.out.println("my number is large");	
		}
	
		System.out.println("End of the program");
		// it will print 2 lines since the condition is false

		System.out.println("-----------------------------------------");
		
		int expectedHours1=15;
		int actualHours1=14;
		//if actual hours is more than expected hours --> you will love Java
		if (actualHours1>=expectedHours1) {
			System.out.println("you will love Java");
		}
			//the system will not print anything since the statement is false
			
			System.out.println("-----------------------------------------");
		
			//if actual hours is equal or more than expected hours --> you will love Java
			//otherwise -->
			if (actualHours1>=expectedHours1) {
				System.out.println("you will love Java");
			} else {//otherwise (if false)-->go inside else block
				System.out.println("you will not like Java");
			}
				//the system will not print anything since the statement is false
			System.out.println("-----------------------------------------");
			int expectedHours=15;
			int actualHours=15;
			//if actual hours is more than expected hours --> you will love Java
			if (actualHours>=expectedHours) {
				System.out.println("you will love Java");
			}
				//the system will not print anything since the statement is false
				
				System.out.println("-----------------------------------------");
			
				//if actual hours is equal or more than expected hours --> you will love Java
				//otherwise -->
				if (actualHours>=expectedHours) {
					System.out.println("you will love Java");
				} else {//otherwise (if false)-->go inside else block
					System.out.println("you will not like Java");
				}
					//the system will not print anything since the statement is false		
	
	}

}
