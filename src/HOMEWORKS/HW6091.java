package HOMEWORKS;

public class HW6091 {

	public static void main(String[] args) {
//Create a String given="I love Java classes at Syntax"
//Retrieve 2 Strings from given String and print them 
//
//Expected Output:
//classes at Syntax
//I love Java
		String str = "I love Java classes at Syntax";

		String str1 = str.substring(12);
		System.out.println(str1);

		String str2 = str.substring(0, 12);
		System.out.println(str2);
	}

}
