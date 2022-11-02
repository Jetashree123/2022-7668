package firstpackage;

public class MultidimensionalArray {

	public static void main(String[] args) {
			//declaring array
			      // int mul2d[][]= new int[5][5];//instantiation
			  /*  mul2d[0][0] = 45; // initialization
			    mul2d[0][1] = 54;
			    mul2d[0][2] = 45;
			    mul2d[0][3] = 54;
			    mul2d[0][4] = 45;
			    
			    mul2d[1][0] = 54;
			    mul2d[1][1] = 45;
			    mul2d[1][2] = 54;
			    mul2d[1][3] = 45;
			    mul2d[1][4] = 54; */
			    
			    
		int muld[][]= { 
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}				
				
		};
		
			for (int i = 0; i<muld.length ; i++)
			{
				for(int j =0; j<muld.length; j++)
				{
					System.out.print(muld[i][j] + " ");
				}
			}
		
			   }

}
