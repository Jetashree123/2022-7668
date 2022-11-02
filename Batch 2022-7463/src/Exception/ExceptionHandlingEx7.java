package Exception;
		
		import java.util.Arrays;


public class ExceptionHandlingEx7 {

			public static void main(String[] args) {

				try {
					Integer[] colorsOfASpectrum = { 7, 6, 5, 4, 3, 2, 1, 0 };

			

					System.out.println("Total number of options on a dice are: " + Arrays.toString(colorsOfASpectrum));

			// 		un-comment the following line to see "Index Out of Bounds Exception"
			      //colorsOfASpectrum[10] = -2; // Index Out of Bounds Exception
				//	colorsOfASpectrum[8] = -1;

					System.out.println(colorsOfASpectrum[1] / 0);	//Arithmetic Exception

				} 
				catch(ArrayIndexOutOfBoundsException e) 
				{
					// This catch block executes in case of "Index Out of Bounds Exception"
					System.out.println("Array Index Out Of Bounds Exception " + e);
				} 
				catch(ArithmeticException e) 
				{
					// This catch block executes in case of "Arithmetic Exception"
					System.out.println("Arithmetic Exception " + e);
				}
				catch(Exception e)
				{
					System.out.println("Common exception occured:" +e);
				}

				System.out.println("\n----Rest of the code executes here----");
	
		}
	
	}

