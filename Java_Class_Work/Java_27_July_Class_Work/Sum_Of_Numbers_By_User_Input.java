package Java_27_July_Class_Work;

import java.util.Scanner;

public class Sum_Of_Numbers_By_User_Input {
	
	// This Program Is Related To " SUM OF MULTIPLE NUMBER GIVEN BY THE USER ".
	
	public static void main ( String args[] ) {
		
		int sum =  0 ;
		
		Scanner sc = new Scanner (System.in) ;
		System.out.println ("Enetr Any Number :") ;
		int num = sc.nextInt();
		
		while (num > 0 ) {
			
			int remainder = num % 10 ;
			sum = sum + remainder ; 
			num = num / 10 ; 
					
		}
			System.out.println ("Sum Of The Number Given By The User Is : " + sum ) ;
	}
}