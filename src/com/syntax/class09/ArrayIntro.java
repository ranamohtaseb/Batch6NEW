package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		// there are twor ways to declare 
		//int num=10;
		//or
		// int num1;
		//num1=10;
		
		
		// to declare an array and iniatialize  it
		// int [] array=new int [4];4 is number of elements, size of array
		// he program will store them based on the index
		
		int [] array=new int [4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
	
		// access elements from an array
		System.out.println(array[2]);
		System.out.println("________________");

		//2 way
		String[] carArray; // prefered way to use
		String carArray1[];
		
		carArray=new String[3];
		carArray[0]="BMW";
		carArray[1]="Honda";
		carArray[2]="Toyota";
		// data type has to be unified
		// if you add the following, you will get an error
		//carArray[3]=1;
		
		System.out.println("I am driving a "+carArray[2]);
		
		System.out.println("________________");
		
		int [] numbers=new int[3];
		numbers[0]=100;
		numbers[1]=200;
		numbers[2]=300;
		//change value of numbers[1]
		numbers[1]=2000;
		
		System.out.println(numbers[1]);//2000
		System.out.println(numbers[1]+numbers[0]);//2100=2000+100
	}

}
