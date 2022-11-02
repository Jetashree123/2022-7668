package Exception;

public class ThrowKeywordEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int x = 20,y = 0,z;
		 try
		 {
			 if (y==0)
			 {
				 throw new ArithmeticException("Any no cannot divisible by 0");
			 }
		   
			 else
				 {
				  z = x/y; 
				 }
		   System.out.println("Result: " +z); // Line 10
		   
		 }
		 catch(ArithmeticException ae){
		   System.out.println("Exception caught: \n" +ae);
		 }

	}

}
