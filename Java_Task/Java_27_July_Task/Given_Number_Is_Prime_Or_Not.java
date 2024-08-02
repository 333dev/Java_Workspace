package Java_27_July_Task;

import java.util.Scanner;

public class Given_Number_Is_Prime_Or_Not {
	
	public static void main (String args []) {
	
	Scanner sc = new Scanner (System.in) ;
	System.out.println ("Enter Number :") ;
	int number = sc.nextInt();
	
	int count = 0 ;
	
	for (int i = 1; i<=number ; i++ ) {
		
		if (number % i == 0) {
			
			count++;
			
		}
	}
		if (count ==2)  {
			System.out.println ("Number Is Prime") ;

		}
		else {
			System.out.println ("Number Is Not Prime") ;

		}
	}
}
