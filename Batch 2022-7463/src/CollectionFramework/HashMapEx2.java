package CollectionFramework;

import java.util.*;

import Queue.Student;
class Student
{
	int id;
    String name;
    String college ;
    String university ;
    double percentage;
    
	public Student(int id, String name, String college, String university, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.university = university;
		this.percentage = percentage;
	}
}
public class HashMapEx2
{
	public static void main(String arg[]) 
	{	
	 HashMap<Integer, Student> details=new HashMap<Integer, Student>();
	 Student s1 = new Student(101,"Shalini", "Kvg college", "Pune University", 70.89);
	 Student s2 = new Student(102,"Shakthi", "SM college", "Madras University", 75.89);
	 Student s3 = new Student(103,"Kaviya", "DY college", "Sikkim University", 71.89);
	 Student s4 = new Student(104,"Ramya", "Rina Mehta college", "Gujrat University", 87.89);
	 Student s5 = new Student(105,"Kaveri", "RJ college", "Mumbai University", 80.89);
	 Student s6 = new Student(106,"Preethi", "PVC college", "Pune University", 85.89);
	  
	 details.put(1,s1);
	 details.put(2,s2);
	 details.put(3,s3);
	 details.put(4,s4);
	 details.put(5,s5);
	 details.put(6,s6);
	 
	 
	 //Iterator<> disp = details.iterator();
	
	 Iterator display = details.entrySet().iterator();
	 while(display.hasNext())
		{
			Map.Entry record=(Map.Entry)display.next();  //will give next (Key, Value) pair
			Student s=(Student)record.getValue();
	        System.out.println(record.getKey()+" "+s.id+" "+s.name+" "+s.college+" "+s.university+" "+s.percentage);
		}
	       }  
	}
