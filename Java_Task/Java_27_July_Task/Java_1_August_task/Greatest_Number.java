package Java_1_August_Task;

import java.util.Scanner;

public class Greatest_Number {
	
	//This Program Is Related To  "Print GREATEST Number"  Through User Input. 

	public static void main(String args[]) {
		
		System.out.println("Enter n(1) & n(2) & n(3) For Finding Greatest Number From Them.\n");

		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter 1");
		int a = sc.nextInt();
		
		System.out.println("Enter 2");
		int b = sc.nextInt();
		
		System.out.println("Enter 3");
		int c = sc.nextInt();
		
		if (a > b && a > c) {
			System.out.println("\n--> Grestest Number Is n(1)");
		}

		else if (b > a && b > c) {
			System.out.println("\n--> Grestest Number Is n(2)");
		}
		
		else if (c > a && c > b) {
			System.out.println("\n--> Grestest Number Is n(3)");
		}
		 
		else {
			System.out.println("\n--> Input Is Not Correct. Please Enter Correct Input");
		} 
	}
	
}
