package Java_1_August_Task;

import java.util.Scanner;

public class Maximum_Number {
	
	//This Program Is Related To  "Maximum Number"  Through User Input. 
	
	public static void main (String args[])  {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number For Get Maximum Number :");
		int n = sc.nextInt();
		
		int max = 0;
		
		while (n>0) {
			
			int remainder = n % 10 ;
			
			if(remainder > max ) {
				
				max = remainder ;
			}
				n = n /10;
		}
		
		System.out.println("\n--> From The Given Input Maximum Number Is :");

		System.out.println(max);
		
	}
}
