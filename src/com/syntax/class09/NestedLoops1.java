package com.syntax.class09;

public class NestedLoops1 {

	public static void main(String[] args) {
		// 4 loops: while, do while, for, advanced for
		// while or do while --> when we do not know number of iterations
		// for or advanced for --> when we know number of iteration ahead of time

		// break --> to stop the loop
		// continue --> to skip current iteration (to move to the next iteration)

		// nested loops --> loop inside the loop
		// for (int i=1; i<=3; i++){
		// SOPln("I am an outer loop");
		// for (int j=1; j<=3; j++){
		// SOPln("I am an inner loop");

		// output:
		// I am an outer loop
		// I am an inner loop
		// I am an inner loop
		// I am an inner loop
		// I am an outer loop
		// I am an inner loop
		// I am an inner loop
		// I am an inner loop
		// I am an outer loop
		// I am an inner loop
		// I am an inner loop
		// I am an inner loop
		for (int i = 1; i <= 3; i++) {


			for (int j = 1; j <= 3; j++) {

				System.out.println(i + "" + j);
				// if we do not add the space between i and j, the compiler will add them
			}

		}
		System.out.println("_________________");
		// using nested loop to print 10 until 99

		for (int i = 1; i <= 9; i++) {
			for (int y = 0; y <= 9; y++) {

				System.out.println(i + "" + y);
			}
		}
	}
}
