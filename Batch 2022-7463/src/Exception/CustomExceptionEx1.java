package Exception;

import java.util.Scanner;

class InvalidPasswordException extends Exception
{
	InvalidPasswordException(String str)
	{
		super(str);
	}
}

class CheckPassword
{
	
	public void test()
	{
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password of 4 to 9 character long");
		String pwd = sc.nextLine();
		try 
		{
			if(pwd.length()> 9 ||  pwd.length()<4)
			{
				throw new InvalidPasswordException("Exception caught : Enter password with specified length");
			}
			else
			{
				System.out.println("Your Password set successfully");
				break;
			}
	   }
	catch(InvalidPasswordException ipd)
		{
		
		System.out.println("Please enter password with specified length!!");
	}
		}
}
	
}

public class CustomExceptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckPassword cp = new CheckPassword();
		cp.test();
	}

}
