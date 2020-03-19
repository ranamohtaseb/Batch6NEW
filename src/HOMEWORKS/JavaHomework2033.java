package HOMEWORKS;

import java.util.Scanner;

public class JavaHomework2033 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int input=scan.nextInt();
		if (input%2==0){
			System.out.println("Value is even");
			if(input>1000) {
				System.out.println("Even value is large");
			}else {
					System.out.println("Even value is just right");
				}
			
		}else {
				System.out.println("Value is odd");
			}
			
		}

	}
