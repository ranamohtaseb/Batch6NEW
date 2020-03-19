package HOMEWORKS;

import java.util.Scanner;

public class JavaHomework2028 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length");

		double length = scan.nextDouble();

		
		System.out.println("Please enter the width");
		
		double width = scan.nextDouble();
		
		
		if (length==width) {
			System.out.println("The shape of your object is square");
		}else {
				System.out.println("The shape of your object is rectangle");
			}
		}
	}


