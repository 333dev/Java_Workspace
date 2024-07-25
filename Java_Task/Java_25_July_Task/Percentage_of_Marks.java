package Java_25_July_Task;

public class Percentage_of_Marks {
	
	public static void main (String args[]) {
		
		int Hindi = 98 ;
		int Gujarati = 95 ;
		int Sanskrit = 80 ;
		int Math = 90 ;
		int Social_Science = 89 ; 
		
		int Sum_Of_Subject  = Hindi + Gujarati + Sanskrit + Math + Social_Science ; 
		int Percentage = Sum_Of_Subject * 100 / 500 ;
		
		System.out.println ("Percentage Of Marks is : " + Percentage) ;
	}
}