package HOMEWORKS;

public class HW6089 {

	public static void main(String[] args) {
//		Validate if the string ends with "u" prints the boolean value accordingly.
//		Validate if the string ends with "world" prints the boolean value accordingly.
//		Validate if the string ends with "are" prints the boolean value accordingly.
//		Validate if the string ends with "you" prints the boolean value accordingly.

		String s1 = "hello how are you";
		boolean ends = s1.endsWith("u");
		System.out.println(ends);
		boolean ends1 = s1.endsWith("world");
		System.out.println(ends1);
		boolean ends2 = s1.endsWith("are");
		System.out.println(ends2);
		boolean ends3 = s1.endsWith("you");
		System.out.println(ends3);

	}

}
