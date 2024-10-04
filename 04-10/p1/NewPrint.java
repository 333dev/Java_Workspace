package p1;

import java.util.jar.Attributes.Name;

public class NewPrint {
	
	
	// Creating a main method
	
	public static void main(String[] args) {
		
		
		//Creating an Object Of Student1 with s1 Object Name
		Student1 s1 = new Student1("Devang", 20, "abc@gmail.com", "java");
		
		
		/*
		Storing Values in object name s1 and calling DisplayStudentDetails
		Because Of Public Method We can only access 
		(1)Student Name
		(2)Student Course
		(3)Student Email
		
		with DisplayStudentDetails
		
		Student Email ,Student Course Is A private method yet we can access because we store in getStudentEmail, getStudentCourse
		Name.
		
		*/
		
		s1.DisplayStudent1Details();
		
		//Protected method accessible because within same package
		System.out.println("StudentId Is: " +s1.studentID);
		
	}
}

/*
 
 PRIVATE :
 
 (1)private method only accessible within class
 (2)but we can store private in another variable name and we can access it. as done in the above program.
 
 
 PUBLIC :
 
 (1)public can be accessible from anywhere.
 
 
 PROTECTED :
 
 (1)within class and within package by inheritance we can access.
 (2)we can not access protected method outside the pacakge.
 
 */

