package HOMEWORKS;

public class JavaHomewrok5085 {

	public static void main(String[] args) {
		// 2D Array
//		Write a program that sums all numbers that are on even index and on even row.
//
//		Expected Output:
//		-4
//		
		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };
		int total = 0;
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {
				if ((a[r][c] < 0) && (a[r][c] % 2 == 0)) {
					total = total - 1;
				}

			}

		}
		System.out.println(total);
	}
}
