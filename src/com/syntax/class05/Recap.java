package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		Scanner variable=new Scanner(System.in);
		
		
		System.out.println("Please enter any text");
		String text=variable.next();
		
		System.out.println("Please enter any text");
		String text1=variable.nextLine();
		
System.out.println("Please enter any number");
int num=variable.nextInt();

System.out.println("Please enter any decimals");
double d=variable.nextDouble();

System.out.println(num);
System.out.println(d);
}
}