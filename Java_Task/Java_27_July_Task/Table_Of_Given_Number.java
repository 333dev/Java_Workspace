package Java_27_July_Task;

import java.util.Scanner;

public class Table_Of_Given_Number {

	// This Program Is Related To " TABLE OF NUMBER GIVEN BY THE USER ".
	
	public static void main ( String args[]) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
	
		for (int i = 1; i <=10; i++ ) {
			int c = n * i ;
			System.out.println (c);
			
		}		
	}
}