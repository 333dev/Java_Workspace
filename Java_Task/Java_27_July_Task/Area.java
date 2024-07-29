package Java_27_July_Task;

import java.util.Scanner;

public class Area {
	
	// This Program Is Related To " AREA OF CIRCLE , TRIANGLE , RECTANGLE ".

	public static void main ( String args[] ) {
	
		Scanner sc = new Scanner ( System.in ) ;
		System.out.println ("Enter Number -> \n (1) FOR Area Of Circle \n (2) FOR Area Of Triangle \n (3) FOR Area Of Rectanlge \n");
		int a = sc.nextInt();
		
		if (a == 1) {
			
			Scanner sc1 = new Scanner (System.in) ;
			System.out.println("Enter Radius oF Circle :");
			int radius = sc.nextInt();
			int  g = radius * radius ;
			float b = 3.14F * g ; 
			System.out.println ("Area Of Circle Is : " +b ) ;
			
			}
			
		else {
				
			}
		
		if (a == 2) {
			
			Scanner sc3 = new Scanner (System.in) ;
			System.out.println("Enter Height Of Triangle :" ) ;
			int height = sc.nextInt();
			
			Scanner sc4 = new Scanner (System.in) ;
			System.out.println("Enter Base Of Triangle :" ) ;
			int base = sc.nextInt();
			
			int c = height * base ;
			
			float d = 0.5F * c ;  
			System.out.println ("Area Of Triangle Is : " +d ) ;
			
			}
			
		else {
				
			} 
			
		if (a == 3) {
   			
   			Scanner sc6 = new Scanner (System.in) ;
   			System.out.println("Enter Length Of Rectangle :" ) ;
   			int length = sc.nextInt();
   			
   			Scanner sc7 = new Scanner (System.in) ;
   			System.out.println("Enter Width Of Rectangle :" ) ;
   			int width = sc.nextInt();
   			
   			
   			int h = length * width ;
   			
   			System.out.println ("Area Of Rectangle Is : " +h ) ;	
   		
			}
			
		else {
				
			}
			
		}	
	}