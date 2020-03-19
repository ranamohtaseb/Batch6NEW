package com.syntax.class03;

public class task2 {
public static void main(String[] args) {
	//Task1: Create a Java program and declare int variable that will hold a month. 
	//Based on the value of the variable your program should print the name of the month.
	int month=11;
if (month==1) {
		System.out.println("It is January");
	} else if (month==2) {
		System.out.println("It is February");
	} else if (month==3) {
		System.out.println("It is March");
	} else if (month==4) {
		System.out.println("It is April");
	} else if(month==5 ) {
		System.out.println("It is May");
	} else if (month==6) {
		System.out.println("It is June");
	} else if (month==7) {
		System.out.println("It is July");
	} else if (month==8) {
		System.out.println("It is August");
	} else if (month==9) {
		System.out.println("It is Septmber");
	} else if (month==10) {
		System.out.println("It is October");
	} else if (month==11) {
		System.out.println("It is November");
	} else if (month==12) {
		System.out.println("It is December");
	} else {
		System.out.println("Is is an invlaid Month!");
	}

System.out.println("________________________________________________");

//Task2: Write a program to check whether number is positive or negative.

int a=-10;

if (a>0) {
	System.out.println("The number is positive");
}else if (a<0) {
	System.out.println("the number is negative");
} else {
	System.out.println("number is Zero");
}

System.out.println("________________________________________________");

//Task3: Write a Java program to check whether number is Even or Odd.
int b=0;

if (b%2==0) {
	System.out.println("The number is even");
}else  {
	System.out.println("the number is odd");
 
}


}
}
