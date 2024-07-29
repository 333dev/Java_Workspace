package Java_27_July_Task ;

import java.util.Scanner;

public class Find_Maximum_Of_Given_Number {
	
		// This Program Is Related To " FINDING MAXIMUM NUMBER GIVEN BY USER ".

	public static void main (String args []) {
		
		int max = 0 ;
		
		Scanner sc = new Scanner (System.in) ;
		System.out.println ("Enter Multiple Number :") ;
		int number = sc.nextInt();
		
		while (number > 0) {
			
			int remainder = number % 10 ;
			 if ( remainder > max ) {
				 
				 max = remainder ;
			 }
			 
			 number = number / 10 ;
		}
		
		System.out.println ("Maximum Number Is : " +max) ;
		
	}
}