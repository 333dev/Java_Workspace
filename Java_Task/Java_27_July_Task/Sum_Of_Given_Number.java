package Java_27_July_Task;

import java.util.Scanner;

public class Sum_Of_Given_Number {
	
	public static void main( String args[]) {
		
		// This Program Is Related To " SUM OF MULTIPLE NUMBER GIVEN BY THE USER ".
		
		Scanner sc = new Scanner (System.in) ;
		System.out.println ("Enter Multiple Number :") ;
		int num = sc.nextInt();
	
		int remainder = num % 10 ;
		
		while (num >=10) {
			
		  num = num /10;
						
		}
		int sum = num + remainder ;
		
		System.out.println("Sum Of The Multiple Number Is : "+sum);
	}
}