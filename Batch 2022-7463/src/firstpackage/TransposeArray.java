package firstpackage;

public class TransposeArray {

	
	public static void main(String args[])
	{
		int arr[][] = { {1,2,3} , {4,5,6}, {8,9,10}};
		
		for(int i = 0; i<arr.length; i++)
		{
			for (int j = 0 ; j<arr.length ;j++ )
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Transpose of Array : ");
		
		for(int i = 0; i<arr.length; i++)
		{
			
			for (int j = 0 ; j<arr.length ;j++ )
			{
				System.out.print( arr[j][i] +" ");
			}
			System.out.println();
		}
		
		
	}
	
}
