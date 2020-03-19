package com.syntax.class03;

public class ifCondition2 {
	public static void main(String[] args) {
		
	double budget=10000;
	double carPrice=12000;
	//using if we are doing verification and selective execution
	if(budget>carPrice) {
		System.out.println("I will buy this car today");
	}else {System.out.println("I will not buy this car today, "+"I will go learn Java");	
	}
	System.out.println("I am code after if condition");	
	
	System.out.println("__________________________");
	
	double budget1=100000;
	double carPrice1=12000;
	//using if we are doing verification and selective execution
	if(budget1>carPrice1) {
		System.out.println("I will buy this car today");
	}else {System.out.println("I will not buy this car today, "+"I will go learn Java");	
	}
	System.out.println("__________________________");

	double budget2=100000;
	double carPrice2=120000;
	//using if we are doing verification and selective execution
	if(budget2>carPrice2) {
		System.out.println("I will buy this car today");
		System.out.println("I will be Happy");
	}else {System.out.println("I will not buy this car today, "+"I will go learn Java");	
	System.out.println("I will be motivated");
	}
	
	
	}

}
