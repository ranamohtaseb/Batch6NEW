package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {

	public static void main(String[] args) {
		/* ask a user were he or she is from
		 * based on the country we will define favorite food
		 * you favorite food is 
		 */

		Scanner scan;
		String country;
		String favoriteFood;
		
		scan= new Scanner(System.in);
		System.out.println("Please enter your country");
		country= scan.nextLine();
		//switch(country.toLowerCase()) { but the country has to be entered in lower case all letters lower case
		//also you can do switch(country.toUpperCase()) { but the country has to be entered in UPPERCASE all letters UPPERCASE 
		// in switch is not same as IgnoreCase
		//IgnoreCase does not work with switch
		switch(country) {
		case "Morocco":
		favoriteFood="coscous";
		break;
		case"Blarus":
			favoriteFood="Potato";
			break;
		case"Tajikistan":
			favoriteFood="Osh";
			break;
		case"Turkey":
			favoriteFood="Baklava";
			break;
		case "Afghanistan":
		favoriteFood="Mantu";
		break;
		case "Kazakhstan":
			favoriteFood="Unknown";
			break;
			
			default:
				favoriteFood="Unknown";
		}
		System.out.println("Your favorite food is "+favoriteFood);
	}
	
	

}
