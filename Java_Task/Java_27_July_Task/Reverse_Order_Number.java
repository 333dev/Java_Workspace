package Java_27_July_Task;

import java.util.Scanner;

public class Reverse_Order_Number {
	
	// This Program Is Related To " PRINTING REVERSE ORDER OF NUMBER GIVEN BY THE USER ".
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner (System.in) ;
		System.out.println("Enter Number :") ;
		int n = sc.nextInt();
		
		for (int i = n; i >=1; i--) {
			System.out.println (+i) ;
			
		}	
	}
}