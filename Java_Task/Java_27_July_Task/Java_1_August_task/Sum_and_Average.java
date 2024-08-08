package Java_1_August_Task;

import java.util.Scanner;

public class Sum_and_Average { 
	
	//This Program Is Related To " Sum and Average" Of Numbers. . 

	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter number");
		int n= sc.nextInt();

	int sum =0;
		
		for (sum = 0;n!= 0 ; n = n/10) {
			
			int r = n % 10 ;
			sum = sum + r;
			
			}
		System.out.println(+sum);
	}
	
}
