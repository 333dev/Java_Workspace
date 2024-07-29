package Java_27_July_Class_Work;

import java.util.Scanner;

public class User_Input {
	
	// This Program Is Related To " HOW TO TAKE USER INPUT ".

	
	public static void main ( String args [] ) {
		
		Scanner sc = new Scanner (System.in) ;
		
		System.out.println ("Enter Your Name : " ) ;
		String name = sc.next();
		
		System.out.println ("Enter Your ID : ") ;
		int id = sc.nextInt();
		
		System.out.println ("Enter Your Salary : ") ;
		double salary = sc.nextDouble();
		
		System.out.println ("\n Your Name Is :" +name + "\n Your ID Is : " +id + "\n Your Salary Is :" +salary) ;
		
		
		if ( salary > 90 ) {
			
			System.out.println ("You Need To Pay Tax") ;
		}
		
		else {
			
			System.out.println (" You Not Need To Pay Tax") ;
		}
	}
}
