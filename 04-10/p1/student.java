package p1;

public class student {
	
	
	//Public accessible from anywhere
	public String name;
	
	//Protected within subclass and same package
	protected int studentID;
	
	//Private accessible within class only
	private String email;
	

	
	//constructor with passing parameter and giving global reference with this Keyword
	public student(String name,int studentID,String email)
	{
		this.name=name;
		this.studentID=studentID;
		this.email=email;
	}
	
	
	//public method to Display student Details
	public void DisplayStudentDetails()
	{
		System.out.println("Student Name Is :" +name);
		System.out.println("Student email Is :" +email);
		
	}
	
	//private method to access private method with getStudentEmail Name So whenever i write getStudentEmail it will give me studentID
	private int getStudentEmail()
	{
		return studentID;
	}
}

//Creating a class Student1 with inheritance of student class with extends keyword
class Student1 extends student
{
	
	//Add new field StudentCourse
	private String StudentCourse;
	
	
	
	//Constructor as same as above giving parameter and passing reference with this keyword but with additional StudentCourse

	public Student1(String name, int studentID, String email,String StudentCourse) {
		super(name, studentID, email);
		this.StudentCourse=StudentCourse;
		// TODO Auto-generated constructor stub
		
	}
	
	
	//private method to access StudentCourse
	private String getStudentCourse()
	{
		return StudentCourse;
	}
	
	//Again Displaying student Details But With Student Course and with DisplayStudent1Details Name
	public void DisplayStudent1Details()
	{
		DisplayStudentDetails();
		System.out.println("Student Enroll In The Course :" +getStudentCourse());
	
	}
	
}