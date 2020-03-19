package HOMEWORKS;

public class JavaHomewrok5084 {

	public static void main(String[] args) {
		// 2D Array
//		Write a program that prints the total number of elements that are negative AND odd
//
//		Output:
//		3
//		int[][] a = {
//				{-5,-2,-3,7},
//				{1,-5,-2,2},
//				{1,-2,3,-4}
//			};
		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if ((a[i][j] < 0) && ((a[i][j] % 2) != 0)) {
					count = count + 1;
				}
			}
		}
		System.out.println(count);
	}
}
