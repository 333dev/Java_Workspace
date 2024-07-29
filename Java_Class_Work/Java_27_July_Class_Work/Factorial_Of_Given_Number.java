package Java_27_July_Class_Work;

import java.util.Scanner;

public class Factorial_Of_Given_Number {
	
	// This Program Is Related To  " FACTORIAL OF THE NUMBER ".

	public static void main ( String args [] ) {
		
		Scanner sc = new Scanner ( System.in ) ;
		System.out.println ("Enter Any Number That You Want To Take Factorial : ") ;
		int n = sc.nextInt();
		
		for(int i=n; i<=1; i--) {
			
			System.out.println (i);
		}	
	}	
}