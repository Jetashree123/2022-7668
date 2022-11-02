package secondpackage;

public class ExceptionHandlingEx1 {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		int a= 10, b=5,sum, div;
		sum = a + b;
		div = a/b;
		System.out.println("Sum of two noms : " + sum +"\n" + "Division of two nos : "  +div );
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Number cannot divisible by zero.");
		}
	}

}
