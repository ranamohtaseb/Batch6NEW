package com.syntax.class09;

public class NestedLoops2MilitaryHours {

	public static void main(String[] args) {
		// Using nested loop to print Military Clock 22:5
		for (int x = 0; x <= 23; x++) {
			for (int y = 0; y <= 59; y++) {
				System.out.println(x + ":" + y);
			}
		}
		// Using nested loop to print Military Clock 22:05
		for (int x = 0; x <= 23; x++) {
			for (int y = 0; y <= 59; y++) {

				if (y < 10) {
					System.out.println(x + ":0" + y);
				} else
					System.out.println(x + ":" + y);
			}
		}
		// Using nested loop to print Military Clock 22:05
		for (int x = 0; x <= 23; x++) {
			for (int y = 0; y <= 59; y++)

				if (y < 10) {
					System.out.println(x + ":0" + y);
				} else {
					System.out.println(x + ":" + y);
				}
		}
		System.out.println("____________");

		// Using nested loop to do car miles - odometer

		for (int x = 0; x <= 9; x++) {
			for (int y = 0; y <= 9; y++) {
				for (int z = 0; z <= 9; z++) {
					for (int j = 0; j <= 9; j++) {
						System.out.println(x + "" + y + "" + z + "" + j);
					}
				}
			}
		}
	}
}
