package Keyword;

class Person{
	   static int age;
	}

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
	     Person p2 = new Person();
	       p1.age = 30;
	       p2.age = 31;
	       Person.age = 32;
	       System.out.println("P1\'s age is: " + p1.age);
	       System.out.println("P2\'s age is: " + p2.age);

	}

}
