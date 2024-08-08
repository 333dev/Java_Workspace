package Java_1_August_Task;

import java.util.Scanner;

public class Vowel_or_Consonants {
	
	//This Program Is Related To " Vowel or Consonants" . 
	
	public static void main(String args[]) {
		
		System.out.println("Checking Alphabet Is Vowel Or Consonants :\n");
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Alphabet :");
		String a = sc.next();
	
		if (a.length()>1) {
			
			System.out.println("\n--> Please Enter Single Alphabet Or Character.");
		}
		
		else {
			
			char b = a.charAt(0);
		
			if ( b >= 'a' && b <='z' || b >= 'A' && b <= 'Z') {
				
			if(b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u' ||
					b == 'A' || b == 'E' || b == 'I' || b == 'O' || b == 'U') {
				
				System.out.println("\n--> This Alphabet Is VOWEL.");
			}
			
			else {
				
				System.out.println("\n--> This Alphabet Is CONSONANT.");
			}
			
			}
	
			else {
				
				System.out.println("\n--> Error.");
			}
		}
		
	}
}

