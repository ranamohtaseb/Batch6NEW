package com.syntax.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		/* We have total 7 days a week
		 * if day is 2,3 --> SDLC Class
		 * if day 6,7 --> Java Class
		 * if day 1,5 --> Off Day
		 * if day 4 --> review class
		 */
int day=6;
day=7;

		if (day==2 && day==3) {
			System.out.println("Today is SDLC Class");
		}else if (day==6 && day==7) {
			System.out.println("Today is Java Class");
		}else if (day==1 && day==5) {
			System.out.println("Today is no class, it is day off");
		}else if (day==4) {
			System.out.println(" It is a review cass with Elion");
		}else{
				System.out.println("Invalid day");
			}
		
		System.out.println("_________________________-");
		
		
		if (day==2 || day==3) {
			System.out.println("Today is SDLC Class");
		}else if (day==6 || day==7) {
			System.out.println("Today is Java Class");
		}else if (day==1 || day==5) {
			System.out.println("Today is no class, it is day off");
		}else if (day==4) {
			System.out.println(" It is a review cass with Elion");
		}else{
				System.out.println("Invalid day");
			}
		
		System.out.println("___________(using String)______________-");
		String day1="Thursday";
		if(day1.equals("Tuesday") || day1.equals("Wednesday")) {
			System.out.println("Today is SDLC CLass");
		}else if( day1.equals("Saturday")|| day1.equals("Sunday")){
			System.out.println("Today is Java Class");
		} else if (day1.equals("Thursday")){
				System.out.println("It is review class with Elion");
		}else if (day1.equals("Friday")) {
			System.out.println(" We are off");
		}else {
				System.out.println("Invalid day");
			}
			
		}
	}


