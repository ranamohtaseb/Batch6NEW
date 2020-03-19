package HOMEWORKS;

public class JavaHomework5080 {

	public static void main(String[] args) {
		// 2D Array
//		Write a program to double the values of every element in the array and print it out.
//
//		Example Output:
//		2.8 4.0 6.6 4.0 
//		8.0 3.0 12.2 2.0 
//		2.4 6.2 8.0 3.2

		double[][] nums = { { 2.8, 4.0, 6.6, 4.0 }, { 8.0, 3.0, 12.2, 2.0 }, { 2.4, 6.2, 8.0, 3.2 } };
		for (int i = 0; i < 3; i++) {
			for (int x = 0; x < 4; x++) {
				System.out.print(nums[i][x] + " ");
			}
			System.out.println();
		}
	}
}