package firstpackage;

import java.util.Scanner;

public class ScannerEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    String myStr = "Hello / This is a / Scanner class / ";
		    //Create a scanner class object with the specified String  
		    Scanner scanner = new Scanner(myStr);
		    //Changing the delimiter of this scanner  
		    scanner.useDelimiter("/");
		    //Printing the tokenized Strings  
		    System.out.println("---The Tokenized Strings are---");
		    while (scanner.hasNext()) {
		      System.out.println(scanner.next());
		    }
		    //Displaying the new delimiter  
		    System.out.println("Delimiter used: " + scanner.delimiter());
		    scanner.close();
	}

}
