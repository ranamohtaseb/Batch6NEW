
package HOMEWORKS;

public class JavaHomework5082 {

	public static void main(String[] args) {
		// 2D Array
//		Write a program that will print the sum of all elements in 2D array. 
//	{

//		Expected Output:
//		-9

		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };
		int sum = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				sum = sum + a[i][j];
				sum++;
			}

		}
		System.out.println(sum);
	}
}
