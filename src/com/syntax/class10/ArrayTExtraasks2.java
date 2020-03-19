package com.syntax.class10;

import java.util.concurrent.ConcurrentHashMap;

public class ArrayTExtraasks2 {

	public static void main(String[] args) {
// Create an array of animals and store 6 elements into it. 
//Using 2 different loops print all elements from the array.
		System.out.println("______Task1: 1st way_______");
		String[] animals = { "Dog", "Cat", "Monkey", "Fish", "Hamsters", "Horses" };
		for (String animal : animals) {
			System.out.println(animal + " ");

		}
		System.out.println("______Task1: 2nd way_______");

		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}

// Create an array on integers and calculate the sum of all integer elements
// in an array.
		System.out.println("______Task2: 1st way_______");
		int[] numbers = { 100, 200, 300, 400 };
		int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3];
		System.out.println(sum);

		System.out.println("______Task2: 2nd way_______");
		int sum2 = 0;
		for (int i : numbers) {
			sum2 += i;
			System.out.println("The summation is " + sum2);
		}

		System.out.println("_______Task3: 1st way__________");
//Create an array of countries. 
//While retrieving all values from an array print capital for each country. 
//(use 2 different loops).
		String[] countries = { "USA", "UK", "Canada", "France" };
		for (String capital : countries) {
			if (capital.equals("USA")) {
				System.out.println("The capital of " + capital + " is Washinton DC");
			} else if (capital.equals("UK")) {
				System.out.println("The capital of " + capital + " is London");
			} else if (capital.equals("Canada")) {
				System.out.println("The capital of " + capital + " is Monterial");
			} else {
				System.out.println("The capital of " + capital + " is Paris");

			}
		}
		System.out.println("_______Task3: 2nd way__________");
		String[] capitals = { "Washington DC", "London", "Monterial", "Paris" };
		for (int i = 0; i < countries.length; i++) {
			System.out.println("The capital of " + countries[i] + " is " + capitals[i]);
		}
		System.out.println("_______Task3: 3rd way__________");
		for (int y=0; y<countries.length;y++) {
			switch (countries[y]){
			case "USA":
			System.out.println("The capital is Washinton DC");
			break;
			case "UK":
			System.out.println("The capital is London");
			break;
			case "Canada":
			System.out.println("The capital is Monterial");
			break;
			case "France":
			System.out.println("The capital is Paris");	
			break;

	}

}}}