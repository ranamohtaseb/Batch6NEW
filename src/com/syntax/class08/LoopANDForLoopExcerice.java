package com.syntax.class08;

public class LoopANDForLoopExcerice {

	public static void main(String[] args) {
		// white a program to calculate sum of off and sum of even numbers
		// 1 to 99

		int sumodd = 0;
		int sumeven = 0;
		for (int i = 1; i <= 99; i++) {
			if (i % 2 == 0) {
				sumeven = sumeven + i;
			} else {
				sumodd = sumodd + i;
			}
		}
		System.out.println("total of even numbers " + sumeven);
		System.out.println("total of odd numbers " + sumodd);

	}

}
