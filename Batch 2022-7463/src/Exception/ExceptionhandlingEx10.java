package Exception;

import java.util.Scanner;
import java.util.*;

public class ExceptionhandlingEx10 {
	int fact= 1;
public void calfact(int num)
{
	for(int i = 1; i<=num;i++)
	{
		fact = fact * i;
	}
	
	System.err.println("Factorial of given number is:  " +fact);
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionhandlingEx10 ex = new ExceptionhandlingEx10();
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Please enter a number");
		int n = sc.nextInt();
		ex.calfact(n);
		}
		catch(InputMismatchException e)
		{
		System.out.println("Incorrect input!! Please enter numeric value between 1 to 100 ");
		}
		//ex.calfact(n);
	}

}
