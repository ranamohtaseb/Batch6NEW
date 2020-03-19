package com.syntax.class02;

public class ArithmaticOperators2 {

	public static void main(String[] args) {
		double num1=100.99;
		double num2=10.99;
		
		
		
		double sum=num1+num2;
		double sub=num1-num2;
		double mult=num1*num2;
		double div=num1/num2;
		
		
		

		
		// write a Java program to add, subtract, multiply and divide 2 decimal value. Your program should say.
	// "The __ of 2 numbers __ and __ is equal to __"
		// for the addition, we can substitute the sum by +(num1+num2) between brackets in order to perform the addition. If no brackets added, the numbers will show as is. 
		
		
		System.out.println("The summuation of 2 numbers "+num1+" and "+ num2+" is equal to "+sum);
		System.out.println("The subtraction of 2 numbers "+num1+" and "+ num2+" is equal to "+sub);
		System.out.println("The multiplication of 2 numbers "+num1+"and "+ num2+" is equal to "+mult);
		System.out.println("The Division of 2 numbers "+num1+"and "+ num2+" is equal to "+div);

		double s=3.9;
		double s2=s*s;
		System.out.println("The square of the "+s+" is "+s2);
		
		int width=5;
		int height=8;
		int area= width * height;
		int peremeter=2*(width+height);
		
		System.out.println("The permeter of a rectangle with width "+width+ " and height "+height+ " is equal to "+peremeter+" and the area is "+area);
				
		
		
		// write a Java program to add, subtract, multiply and divide 2 decimal value. Your program should say.
		// "The __ of 2 numbers __ and __ is equal to __"	
	

	}

}
