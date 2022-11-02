
public class Sumofcols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] nos = {
				{1,2,3,4},
				{11,12,13,14},
				{21,22,23,24},
				{31,32,33,34}
		};
		
		for(int i = 0 ; i<nos[0].length;i++)
		{
			int total = 0;
			
			for (int j = 0 ; j< nos.length ; j++)
			{
				total += nos[i][j];
					
			}
			System.out.println(" sum of row " + i + " is " +total  );
		}
		
		
	}

}
