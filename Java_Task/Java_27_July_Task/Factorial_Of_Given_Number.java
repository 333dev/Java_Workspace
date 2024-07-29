package Java_27_July_Task;

import java.util.Scanner;

public class Factorial_Of_Given_Number {
	
	//	// This Program Is Related To " FACTOROIAL OF NUMBER BY USER ".
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in) ;
		
		System.out.println("Enter Number For Factorial :") ;
		
		int number = sc.nextInt() ;
		int factorial = 1 ;
		
		
		for(int i = 1; i<= number ; i ++) {
			System.out.println(i);
			factorial = factorial * i ;
		}
			
		System.out.println("Factorial Of Given Number Is :\n " +factorial);
		
	}
}