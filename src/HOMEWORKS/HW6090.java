package HOMEWORKS;

public class HW6090 {

	public static void main(String[] args) {
//		Print out the position of the first occurrence of "c".
//		Print out the position of the first occurrence of " ".
//		Print out the position of the first occurrence of the variable target1.
//		Print out the position of the first occurrence of the variable target2.
//
//		Expected Output:
//		4
//		11
//		6
//		-1
		String str = "abracadabra alakazam";
		String target1 = "dab";
		String target2 = "ABRA";
		int index = str.indexOf("c");
		System.out.println(index);
		int index1 = str.indexOf(" ");
		System.out.println(index1);
		int index2 = str.indexOf(target1);
		System.out.println(index2);
		int index3 = str.indexOf(target2);
		System.out.println(index3);
	    
	}

}
