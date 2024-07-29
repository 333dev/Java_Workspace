package Java_27_July_Task;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main ( String args[] ) {
		
			// This Program Is Related To " FIBONACCI SERIES BY USER ".
		
		Scanner sc = new Scanner (System.in) ;
		System.out.println ("Enter Number For You Want A Fibonacci Series :") ;
		int n = sc.nextInt();
		
		int a= 0;
		int b= 1;
		
		int Fibonacci ;
		 
		for(int i = 0; i<=n; i++) {
			
			Fibonacci = a + b ;
			a=b;
			b = Fibonacci ;
			System.out.println(+Fibonacci);
		}
		
	}	
}