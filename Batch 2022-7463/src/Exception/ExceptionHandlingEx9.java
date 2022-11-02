package Exception;

import java.util.Scanner;

public class ExceptionHandlingEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		int a = 20, b = 10; 
		try 
		{ 
		 System.out.println("Value of a: " +a); 
		 System.out.println("Value of b: " +b); 
		 int div = a/b; 
		 System.out.println("Division: " +div); 
		} 
		catch(ArithmeticException ae) 
		{ 
		  System.out.println(ae); // prints corresponding exception. 
		 } 
		finally 
		{ 
		 sc.close();
		 System.out.println("Denominator cannot be zero"); 
		} 
		//rest of code
		System.out.println("Hello Java"); 
	}

}
