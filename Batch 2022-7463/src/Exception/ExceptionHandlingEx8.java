package Exception;

public class ExceptionHandlingEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int[] arr = new int[10];
		try {
			arr[9] = 12;
			arr[1]= 14;
			System.out.println(arr[1]);
		}
	catch(ArrayIndexOutOfBoundsException ex)
		{
		System.out.println("Array size exceeded");
		}

	}
}


