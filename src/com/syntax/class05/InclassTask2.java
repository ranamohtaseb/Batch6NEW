package com.syntax.class05;

public class InclassTask2 {

	public static void main(String[] args) {
		//Write a program that will print whether it is a weekend or weekday. 
		//If any day from 1-5 → output “It is a weekday”, any day from 6-7 → output “It is a weekend”,
		//any other day → output “Invalid day”
		
		int day=7;
		
		if(day>=1 && day<=5) {
			System.out.println("It is a weekday");
		}else if(day==6||day==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("It is an invalid day");
		}
		
		System.out.println("_____Using all ORS_____");
		
		int dayx=1;
		if(dayx==1 || dayx==2 || dayx==3||dayx==4 ||  dayx==5) {
			System.out.println("It is a weekday");
		}else if(dayx==6||dayx==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("It is an invalid day");
		}
	}

}
