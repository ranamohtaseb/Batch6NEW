package com.syntax.class12;

public class GroupTask3 {

	public static void main(String[] args) {

//Part 1: Programming Questions

//Task1
//Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?

//Task2
//Write a java program to check whether a given number is prime or not?

//Task3
//Write a Java Program to print first 10 numbers of Fibonacci series.

//Task4
//Find out how many alpha characters are present in a String?  Find number of words in string?

//Task5
//Write a java program to reverse String? Reverse a string word by word?

//Task6
//Write a Java Program to find whether a String is palindrome or not?

//Task7
//Write a java program to find the second largest number in the array? Maximum and minimum number in the array?}

		
		int a=10;
		int b=20;
		
		a=a+b; //30
		b=a-b; //30-20=10
		a=a-b;
		
		System.out.println("The value of a= " +a);
		System.out.println("The value of b= "+b);
		
		String str1="Day";
		String str2="Night";
		//str1=str1.concat(str2);
		str1=str1+str2;//DayNight
		str2=str1.substring(0,3);//Day
		str1=str1.substring(3);//Night
		System.out.println("The value of str1= "+str1);
		System.out.println("The value of str2= "+str2);
		
		String str1="Day";
		String str2="Night";
		//str1=str1.concat(str2);
		str1=str1+str2;//DayNight
		str2=str1.substring(0,3);//Day
		str1=str1.substring(3);//Night
		System.out.println("The value of str1= "+str1);
		System.out.println("The value of str2= "+str2);
		
		String str3="Synatx";
		String str4="Technologies";
		//str3=str3.concat(str4);
		str3=str3+str4;//DayNight
		str4=str3.substring(0,str3.length()-str4.length());//Day
		str3=str3.substring(str3.length());//Night
		System.out.println("The value of str3= "+str3);
		System.out.println("The value of str4= "+str4);
}}
