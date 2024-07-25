package Java_Data_Type_Class_Work;

public class Nested_If {
	
	public static void main (String args[]) {
		
		int age = 18 ; 
		
		
		if (age >= 18) {
			
			System.out.println("Eligible For Vote");
		
			if (age >=60) {
				 
				System.out.println ("Senior Citizen");
			}
		
			else {
				
				System.out.println ("Person Is Not Under Senior Citizen Category");
			}
		}
				
		else {
			
			System.out.println (" Not Eligible For Vote");
		}
				
	}
}