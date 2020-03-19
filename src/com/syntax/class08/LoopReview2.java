package com.syntax.class08;

import java.util.Scanner;

public class LoopReview2 {

	public static void main(String[] args) {
		/*Ask a use to pay for a candy
		 * As long as the entered price is not 2
		 * we need loop to ask for paying
		 * once amount is correct, you will say-->"enjoy your candy"
		 */
			
				Scanner scan;
				double price;
				
				
				scan=new Scanner(System.in);
			
			System.out.println("_________ using while loop not do while_________");	
			
			while (price !=2) {
				System.out.println("please pay for your candy");
				price=scan.nextDouble();
			}
			System.out.println("Enjoy your candy");
			}

		
	}


