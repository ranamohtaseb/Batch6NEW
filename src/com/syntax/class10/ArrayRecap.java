
package com.syntax.class10;

public class ArrayRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] grades = new int[4];
		grades[0] = 90;
		grades[1] = 67;
		grades[2] = 89;
		grades[3] = 78;

		// what is the average?
		int average = (grades[0] + grades[1] + grades[2] + grades[3]) / 4;
		System.out.println("The averae grade is" + average);
		System.out.println("____________Creating an array of Cities___________");

		String[] cities = { "Washington DC", "NYC", "Paris", "Miami", "LA", "Dallas", "Chantily" };
// I live in Paris
		System.out.println("I live in " + cities[2]);
		int x = 1;
		System.out.println(cities[x]);
		x += 3;
		System.out.println("I moved to " + cities[x]);

		System.out.println("__________________");

		// how many elements stored inside an array?
		int arraySize = cities.length;// 7
		System.out.println("Total elements " + arraySize);

		System.out.println("__________________");

		// how can we access last element from an array?
		// array size is 7 BUT the elements start at 0, so you subtract 1 from the
		// length
		System.out.println(cities[arraySize - 1]);

		System.out.println("__________________");

		// access all elements from an array
		for (int i = 0; i < arraySize; i++) {
			System.out.println(cities[i]);

			
		}
		System.out.println("__________________");
	}

}
