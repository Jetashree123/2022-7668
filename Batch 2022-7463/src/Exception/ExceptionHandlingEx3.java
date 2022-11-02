package Exception;

public class ExceptionHandlingEx3 {
	
	String username="Jetashree";
	String password="Jetashree@123";
	
	public void nullPointerExceptionEx()
	{
		
		try {
			if(username.equals("Jetashree") && password.equals("Jetashree@123"))
				{
					System.out.println("Access Granted!");
				}
			else
				{
					System.out.println("Access Denied!");
				}
	
		}
		//catch block executes when exception occurs
		catch(NullPointerException e)
		{
			System.out.println("Eneter valid username and password");
			e.printStackTrace();
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionHandlingEx3 ex = new ExceptionHandlingEx3();
		ex.nullPointerExceptionEx();
		
	}

}
