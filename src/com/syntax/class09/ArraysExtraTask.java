package com.syntax.class09;

public class ArraysExtraTask {

	public static void main(String[] args) {
//		1.Create an array of chars and store grades into it: A,B,C,D,E,F. 
//		Then print a grade B (use 2 different ways of creating an array).

//		2. Create an array of names and store all names of your group. 
//		Then print your name from that array. 
//		(use 2 different ways of creating an array).
//		
//		3. Create an array of words: Java, Saturday, day, coding, is. 
//		Print the following sentence using elements of array: 
//		“Saturday is Java coding Day”.

		// char[] stringToCharArray = testString. toCharArray()
		// String [] synataxClasses= {"SDLC","Manual Testing","Java","GIT"};

		System.out.println("__________Task1_____________");
		// Task1 - 1st way
		char[] grade = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(grade[1]);
		System.out.println("+++");
		//getting all elements
		for (int i=0; i<grade.length;i++)
		System.out.println(grade[i]);

		// Task1 - 2nd way
		char[] gradeNew = new char[6];
		
		gradeNew[0] = 'A';
		gradeNew[1] = 'B';
		gradeNew[2] = 'C';
		gradeNew[3] = 'D';
		gradeNew[4] = 'E';
		gradeNew[5] = 'F';
		System.out.println(gradeNew[1]);

		System.out.println("__________Task2_____________");
		// Task2 - 1st way
		String[] freedomWriters = { "Mohammed", "Eman", "Tarek", "Rana", "Omar", "Sabah", "Abreham" };
		System.out.println(freedomWriters[3]);

		// Task2 - 2nd way
		String[] freedomWritersNew = new String[7];
		freedomWritersNew[0] = "Mohammed";
		freedomWritersNew[1] = "Eman";
		freedomWritersNew[2] = "Tarek";
		freedomWritersNew[3] = "Rana";
		freedomWritersNew[4] = "Omar";
		freedomWritersNew[5] = "Sabah";
		freedomWritersNew[6] = "Abreham";
		System.out.println(freedomWritersNew[3]);

		System.out.println("__________Task3_____________");
		// Task3 - 1st way
		String[] javaClass = { "Java", "Saturday", "day", "coding", "is" };
		System.out.println(
				javaClass[1] + " " + javaClass[4] + " " + javaClass[0] + " " + javaClass[3] + " " + javaClass[2]);

	}
}
