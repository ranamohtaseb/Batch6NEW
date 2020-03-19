package com.syntax.class06;

import java.util.Scanner;

public class SwitchAndScanner {
	public static void main(String[] args) {
/*Ask user gender: M or F
 * Based on the gender will provide the description
 */
	Scanner scan;
	char gender;
	String genderType;
	
	scan=new Scanner(System.in);
	System.out.println("Please eneter gender: M or F");
	
	gender=scan.next().charAt(0);
	
	switch(gender) {
	case 'M':
		genderType="Male";
			break;
	case 'F':
		genderType="Female";
		break;
		default:
			genderType="Invalid";
	}
	System.out.println("Your gender is "+genderType);
	}
}
	
	
	
	
	
	

