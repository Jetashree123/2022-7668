package Exception;

public class ExceptionHandlingEx1 {

	public static void main(String[] args) {

		try {
		int a=10,b=5;
		System.out.println("One");
		System.out.println("two");
		int result = a/b; //exceptional case
		System.out.println("three");
		System.out.println("four");
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Any number cannot be divisible by 0 ");
		}
		}
	
	}
