package HOMEWORKS;

public class JavaHomework5075 {

	public static void main(String[] args) {
//		Using the following array. 
//		{45, 78, 12,  67, 55, 89, 23, 77, 88}
//		Create a for loop to extract values from that array so your output looks as below:
//
//		Expected Output:
//		78 13 11 
//
//		Note: Find out what is the start point an how much you need to increment to get the result. 
//		
	// NEW INPUT
//Using the following array. 
		
//		{45, 78, 12,  67, 55, 89, 23, 77, 88}
//		Create a for loop to extract values from that array so your output looks as below:
//
//		Expected Output:
//		78 55 77 
       int[] num = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };
		for(int i=0;i< num.length;i+=2) {
		System.out.println(num[i]+" ")
		};
	
			//System.out.print(num[1] + " " + (num[2] + 1) + " " + (num[2] - 1));
	}

}
