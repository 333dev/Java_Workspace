package Java_27_July_Task;

import java.util.Scanner;

public class Sum_Of_First_and_Last_Digit {
	
	// This Program Is Related To " SUM OF FIRST AND LAST DIGIT OF NUMBER GIVEN BY THE USER ".
	
	public static void main(String args[]) {
		
		Scanner sc =new Scanner (System.in) ;
		System.out.println ("Enter Multiple Number :");
		int number = sc.nextInt();
		
		int Last_Digit = number % 10 ;
	
		int First_Digit = number ;
		while (First_Digit > 10) {
						
		First_Digit = First_Digit / 10 ;
		
		}
		
		int sum ;
		sum = First_Digit + Last_Digit ;
			
		System.out.println ("Sum Of First And Last Digit Is : "+sum) ;
	}
}