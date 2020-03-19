package com.syntax.class10;

public class ArrayRecap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };

		// getting all elements
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + " ");
		}
		System.out.println();
		System.out.println("__________Printing using advanced for loop________");
		for (char Rana : grades) { // it will itirate each element inside the array and save
			System.out.print(Rana + " ");
		}
		System.out.println();
		System.out.println("_____________");

		// create an array of fruits and retrive all

		String[] fruits = { "Banana", "Kiwi", "Apple", "Mango" };
		// advanced for loop, enhanced for loop, for each loop
		for (String fruit : fruits) {
			System.out.println(fruit + " ");
		}
		System.out.println("___________");
		// regular for loop
		// fruits.length= number of elements in the array = the length of array and this
		// is where the loop will stop
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
System.out.println("_____________________");
			// if fruit is apple --> this is your favourite fruit
			for (String fruit : fruits) {
				if (fruit.equals("Apple")) {
					System.out.println(fruit + " is my favourite fruit.");
				}
				System.out.println();
					System.out.println(fruit+" ");
					System.out.println("______________");
					// regulaer for loop
					//fruits.length=number of elem
					for ( i=0; i<fruits.length;i++){
						System.out.println(fruits[i]);	
				}
			}}}}
		
		
		