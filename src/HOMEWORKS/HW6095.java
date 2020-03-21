package HOMEWORKS;

public class HW6095 {

public static void main(String[] args) {
//Create a String given="Hello Syntax friends". 
//Using String methods from given String create new String "Welcome Syntax family"
//
//Expected Output:
//Welcome Syntax family
		String str = "Hello Syntax friends";
		String str1 = str.replace("Hello","Welcome");
		String str2=str1.replace("friends", "family");
		System.out.println(str2);
	}

}
