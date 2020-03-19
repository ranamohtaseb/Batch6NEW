
package HOMEWORKS;

public class JavaHomework5079 {

	public static void main(String[] args) {
//		Write a program to print values from a 2D array
//
//		Example Output:
//		1.4 2.0 3.3 2.0 
//		4.0 1.5 6.1 1.0 
//		1.2 3.1 4.0 1.6 
//		double[][] a = {
//		{1.4,2.0,3.3,2},
//		{4,1.5,6.1,1},
//		{1.2,3.1,4,1.6}
//	};
//		
		double[][] nums = { { 1.4, 2.0, 3.3, 2.0 }, { 4.0, 1.5, 6.1, 1.0 }, { 1.2, 3.1, 4.0, 1. } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
System.out.print(nums[i][j]+" ");

			}
			System.out.println();
		}

	}
}
