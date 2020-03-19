package HOMEWORKS;

public class JavaHomework4053 {

	public static void main(String[] args) {

//			Using do while loop print even numbers from 20 to 1
//			Expected Output:
//			20
//			18
//			16
//			14
//			12
//			10
//			8
//			6
//			4
//			2
		int num = 20;
		do {
			if (num % 2 == 0)
				System.out.println(num);
			num--;
		} while (num > 1);
	}

}
