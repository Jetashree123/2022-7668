		package Exception;

		import java.util.Scanner;

		public class ExceptionHandlingEx6{

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Pease enter first no:");
		int num1= sc.nextInt();
		System.out.println("Pease enter second no:");
		int num2= sc.nextInt();
		if(num2 == 0)
		{
			//block to be executed when condition is true
			try {
					System.out.println("Division of two numbers is" +num1/num2);
				}
				catch(ArithmeticException e)
				{
					System.out.println("Division by zero is not allowed");
				}
		}
		
		else
			{
				System.out.println("Division of two numbers is : " +num1/num2);
			}
		}
	}

