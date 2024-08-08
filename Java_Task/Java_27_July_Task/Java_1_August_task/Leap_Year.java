package Java_1_August_Task;

import java.util.Scanner;

public class Leap_Year {
	
	//This Program Is Related To  "Leap Year " . 

	public static void main(String args[]) {
		
		System.out.println("Enter Year To Check It's A LEAPYEAR or Not . \n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year :");
		int n = sc.nextInt();

		if (n % 4 == 0 ) {
			System.out.println("\n--> This Is A LeapYear.");
		}
		else {
			System.out.println("\n--> This Is Not A LeapYear");
		}
		
	}
}
