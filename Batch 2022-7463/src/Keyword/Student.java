package Keyword;

public class Student {

	//instace variables of class student
	String name;
	int rollno;
	
	
	//declare parameterised constructor
	Student(String name, int rollno)
	{
		this.name =name;
		this.rollno=rollno;
	}
	
	//declare method to display student details
	
	public void display()
	{
		
		System.out.println("Student name is:" +name+ " Roll no is: " + rollno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("Naveen", 111);
		Student s2 = new Student("Rohith", 222);
		Student s3 = new Student("Sravankumar",333);
		
 s1.display();
 s2.display();
 s3.display();
	}

}
