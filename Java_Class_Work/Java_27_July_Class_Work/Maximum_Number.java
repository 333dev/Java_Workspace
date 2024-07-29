package Java_27_July_Class_Work;

import java.util.Scanner;

public class Maximum_Number {
	
	// This Program Is Related To " FINDING MAXIMUM NUMBER GIVEN BY USER ".
	
	public static void main ( String args [] ) {
		
		int max = 0 ;
		
		Scanner sc = new Scanner ( System.in ) ;
		System.out.println("Enter Any Number : " ) ;
		int num = sc.nextInt() ;
		 
		while (num > 0 ) {
			
			int remainder = num % 10 ;
			
			if (remainder > max ) {
				
				max = remainder ;
			}
			
			num = num / 10 ;
		}
		
		System.out.println ("Maximum Number Is : " + max ) ;
	}
}