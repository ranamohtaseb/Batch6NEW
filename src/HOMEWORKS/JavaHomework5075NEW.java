package HOMEWORKS;

public class JavaHomework5075NEW {

	public static void main(String[] args) {
//Using the following array. 

//		{45, 78, 12,  67, 55, 89, 23, 77, 88}
//		Create a for loop to extract values from that array so your output looks as below:
//
//		Expected Output:
//		78 55 77 

		int[] num = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };
		for (int i = 1; i < num.length; i += 3) {
			System.out.print(num[i] + " ");
		}
	}

}
