package com.syntax.class10;

public class ArrayRecapFuitsApple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---printing using advanced for loop-------");
		
		// create an array of fruits and retrieve all elements
		String[] fruits = { "Banana", "Kiwi", "Apple", "Mango" };
		// if fruit is apple---> that is your favorite fruit
		// advanced for loop, enhanced for loop, for each loop
		for (String fruit : fruits) {
			if (fruit.contentEquals("Apple")) {
				System.out.println(fruit + " is my favorite fruit.");
			}
			System.out.println();
			System.out.print(fruit + " ");
			// regular for loop
			for (int i = 0; i < fruits.length; i++) {
				System.out.println(fruits[i]);
			}
		}
	}
}
