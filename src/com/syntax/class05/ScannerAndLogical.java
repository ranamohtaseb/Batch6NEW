package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {
	// thge user is a salesman
		// ask the user how much was his sales
		//based on the amount of sales, you will calculate commision
		//if sales between 1 - 100 --> commission should be 10%
		//if sales between 100 - 200 --> commission should be 20%
		//if sales between 200 - 500 --> commission should be 30%
		// if sales more than 500 --> commission should be 50%
		
		//1. declare all variables that I will need
		//scanner scan, double sales, double commission
		
		double sales;
		double commission;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your sales amount");
		sales=scan.nextDouble();
		
		if (sales>=1 && sales<=100) {
			commission=sales*0.10;
		}else if (sales>100 && sales <=200) {
			commission=sales*0.20;
		}else if (sales>200 && sales<=500) {
			commission=sales*.30;
		}else {
			commission=sales*0.50;
			
		}
	
		System.out.println("Based on your sales, your commision is = "+commission+"$");
// since we have used the commission as a variable, you can always adjust and modify in the future.
		//Therefore, we were able to print a comment as shown below
		if (commission >100) {
	System.out.println("You are an awesoem seller");
	
}
	}

}
