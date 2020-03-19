package HOMEWORKS;

public class JavaHomework5081 {

	public static void main(String[] args) {
		// 2D Array
//		Write a program that prints the highest value in the array.
//
//		Expected Output:
//		8
///		int[][] a = {
//		{5,2,3,7},
//		{1,5,1,1},
//		{8,3,1,2}
//	};

		int[][] a = { { 5, 2, 3, 7 }, { 1, 5, 1, 1 }, { 8, 3, 1, 2 } };

		int max = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
		}
		System.out.println(max);
	}
}
