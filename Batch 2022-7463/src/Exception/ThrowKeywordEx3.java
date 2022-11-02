package Exception;

class ThrowKeyword {

		public void m1()
		{
		try {
		// Taking a string with 9 chars. Their index will be from 0 to 8.
		   String str = "Technology";
		   System.out.println("Length of the string str is : " +str.length());
		   char ch = str.charAt(11); // Exception is thrown because there is no index with value 10.
		}
		catch(StringIndexOutOfBoundsException se){
		  System.out.println("String index out of range");
		  throw se; // Rethrow the same exception.
		  }
		 }
		}
		
public class ThrowKeywordEx3{
		
			public static void main(String[] args) {
		// Create an object to class A and call m1() method.	
			ThrowKeyword th = new ThrowKeyword();
		 try
		 {
		   th.m1();
		 }
		// Rethrown exception is caught by below catch block. 
		 catch(StringIndexOutOfBoundsException se){
		  System.out.println("Rethrow exception is caught here: " +se);	 
		 }
		 }
		}
	
