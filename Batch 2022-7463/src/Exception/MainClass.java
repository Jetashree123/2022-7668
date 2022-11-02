package Exception;

class OwnException extends Exception
{
	OwnException()
	{
		
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		
		{
			OwnException oe = new OwnException();
			throw oe;
		}
		catch(OwnException ex)
		{
			System.out.println("User-defined exception occured!!!");
			ex.printStackTrace();
		}
		
		
	}

}
