package Exception;

import java.util.Scanner;

public class ThrowKeywordEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		for(num = 1; num <= 10; num++){
		try
		{
		 if(num == 5) 
		 {
		   throw new ArithmeticException("ArithmeticException");
		 }
		 else if(num < 2)
		 {
		   throw new RuntimeException("RuntimeException");
		 }
		 else if(num > 9)
		 {
		   throw new NullPointerException("NullPointerException");
		 }
		}
	
		catch(Exception e)
		{
		  System.out.println("Caught an exception");
		  //System.out.println(e.getMessage());
		 }
		}
	}
}

