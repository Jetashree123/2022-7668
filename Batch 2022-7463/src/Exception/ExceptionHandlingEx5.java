package Exception;

import java.util.Scanner;

public class ExceptionHandlingEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Pease enter first no:");
int num1= sc.nextInt();
System.out.println("Pease enter second no:");
int num2= sc.nextInt();
if(num2 == 0)
{
	System.out.println("Division by zero is not allowed");
}
else
	{
		System.out.println("Division of two numbers is : " +num1/num2);
	}
}
	}


