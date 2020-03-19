package com.syntax.class07;

public class ForLoopIntro {

	public static void main(String[] args) {

		// using while ;
		// int c=1; we declare variable
		// while (c<6){ --> test condition
        //code;
		//code;
		//code;

		// c++; --> increment
		// }
		// in for loop ==> we combine all previous steps in one line
		
		
		//Good Morning 5 times
		
		for (int c=1; c<6; c++) {
			// it will only print when it is true
			System.out.println("Good Morning");
		}
		System.out.println("___________________________");
		
		//print numbers from 1 to 10
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("___________________________");
		//print numbers 10 to 1
		for (int x=10; x>=1; x--) {
			System.out.println(x);
		}
		System.out.println("___________________________");
		//what will be the output
		for (int y=0; y<50; y+=5) {
			System.out.println(y);
	}
		System.out.println("___________________________");
		int sum=0;
		for (int i=1; i<5;i++) {
			sum=sum+i;
		}
			System.out.println("Value of sum "+sum);
		
	}
}
