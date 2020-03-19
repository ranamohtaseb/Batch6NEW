package com.syntax.class11;

public class ArrayTask {

	public static void main(String[] args) {
// task 1
//Create an array of cars : american, german, korean, italian. 
//Then retrieve all values from that array using 2 different loops
		String[][] cars = { { "Ford", "GMC" }, { "BMW", "Benz" }, { "KIA", "Hyundai" } };
		for (String[] motor : cars) {
			for (String make : motor) {
				System.out.print(make + " ");
			}
			System.out.println();
		}
		System.out.println("______Using Nested for Loop__________");
		for (int r = 0; r < cars.length; r++) {
			for (int c = 0; c < cars[r].length; c++) {
				System.out.print(cars[r][c] + " ");
			}
			System.out.println();
		}

		System.out.println("_____Task 2________");
//Create an array of countries: north america countries, south america countries, 
//europe countries, asian countries, african countries. 
//Then print all values from that array using 2 different loops and 
//calculate how many total countries been stored.
		
//String[][] countries= {
//		{"USA", "Canada","Mexico"},
//		{"Brazil", "Pru", "Argentina"},
//		{"Italy","Paris","Spain"},
//		{"India","China","Japan"},
//		{"Morroco","Kenya","South Africa"}
//};

//for (String[] country:countries) {
//	for (String [] location:countries) {
//		System.out.println(location+" ");
//	}
//
//		System.out.println();
//}	
//	int sum = 0;
//	for(int i = 0; i < countries.length; i++) {
//		for(int j = 0; j < countries[i].length; j++) {
//			sum += 1;
//		}
//	}
//	System.out.println(sum);
//	
		String[][] countries = { { "Canada", "USA" }, { "Mexico", "Brazil" }, { "France", "Italy" },
				{ "Korea", "India" }, { "Morocco", "South Africa" } };
		for (String[] name : countries) {
			for (String x : name) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		int count = 0;
		for (int i = 0; i < countries.length; i++) {
			for (int j = 0; j < countries[i].length; j++) {
				count += 1;
			}
		}
		System.out.println(count);
	}

}
//Asel code

//    String[][] countries = { 
//            { "Canada", "Mexico", "USA" }, 
//            { "Colombia", "Paraguay", "Ecuador" },
//            { "Poland", "Austria", "Portugal" }, 
//            { "Philippines", "Cambodia", "Vietnam", "Indonesia" },
//            { "Morocco", "South Africa", "Namibia", "Uganda", "Eritrea" }, };
//    
//    int total=0;
//    for (int x = 0; x < countries.length; x++) {
//        for (int y = 0; y < countries[x].length; y++) {
//            System.out.print(countries[x][y] + " ");
//            total++;
//        }
//        System.out.println();
//    }
//    System.out.println("Total:"+total);
//    System.out.println("-------Using Advanced FOR Loop-------");
//    int count=0;
//    for (String[] world : countries) {
//        for (String c : world) {
//            System.out.print(c + " ");
//            count++;
//        }
//        System.out.println();
//    }
//    System.out.println("Total="+count);
//}
//}

