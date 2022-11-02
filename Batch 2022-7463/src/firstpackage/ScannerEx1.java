package firstpackage;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			    Scanner sc = new Scanner(System. in );
			    System.out.println("Taking inputs from user");
			    System.out.println("Enter name of the Employee:");
			    // String input 
			    String name = sc.nextLine();
			    System.out.println("Enter post:");
			    String post = sc.nextLine();
			    System.out.println("Enter gender:");
			    // Character input 
			    char gender = sc.next().charAt(0);
			    // Numerical data input 
			    System.out.println("Enter age:");
			    int age = sc.nextInt();
			    System.out.println("Enter mobile number:");
			    long mobileNo = sc.nextLong();
			    System.out.println("Enter salary");
			    double salary = sc.nextDouble();
			    // Print the values to check if the input was correctly obtained. 
			    System.out.println("\nName: " + name);
			    System.out.println("Post: " + post);
			    System.out.println("Gender: " + gender);
			    System.out.println("Age: " + age);
			    System.out.println("Mobile Number: " + mobileNo);
			    System.out.println("Salary: " + salary);
	}

}
