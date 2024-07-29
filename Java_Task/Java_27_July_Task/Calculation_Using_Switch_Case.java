package Java_27_July_Task;

import java.util.Scanner;

public class Calculation_Using_Switch_Case {
	
	// This Program Is Related To  " CALCULATION USING SWITCH CASE STATEMENT ".
	
	public static void main (String args[]) {
		
		System.out.println("Enter Number A and B For Calculation :\n");
		
		Scanner sc =new Scanner (System.in);
		System.out.println ("Enter Number A :" ) ;
		int A = sc.nextInt();
		
		Scanner sc1 =new Scanner (System.in);
		System.out.println ("Enter Number B :" ) ;
		int B = sc1.nextInt();
		
		System.out.println();
		Scanner sc2 =new Scanner (System.in);
		System.out.println ("Enter Number :\n (1) For Addition Of A and B \n (2) For Substraction Of A and B \n (3) For Multiplication Of A and B \n (4) For Division Of A and B \n (5) For Modulo Of A and B \n ") ;
		int n = sc.nextInt();
		System.out.println();
		
		switch (n) {
		
		case 1 : System.out.println ("Addition Of A and B Is : " +( A + B) );
		break ;
		
		case 2 : System.out.println ("Substraction Of A and B Is : " +( A - B) );
		break ;
		
		case 3 : System.out.println ("Multiplication Of A and B Is : " +( A * B) );
		break ;
		
		case 4 : System.out.println ("Division Of A and B Is : " +( A / B) );
		break ;
		
		case 5 : System.out.println ("Modulo Of A and B Is : " +( A % B) );
		break ;
		
		default : System.out.println (" Input Is Not Correct. Please Enter Correct Input. " );
		break ;
		}
		
	}
}