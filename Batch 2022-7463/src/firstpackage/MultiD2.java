package firstpackage;

public class MultiD2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String[] str = {"John", "Alice","Bob"}; // One dimensional array.	
		  int[ ][ ] marks = new int[3][3]; // Two dimensional array.
           /*int[][] marks = { 
            * {80,97,80},
            * {99,98,100},
            * {81,87,83},
	}*/
		// Allocating memory for marks obtained in three subjects by student John
		    marks[0][0] = 80;
		    marks[0][1] = 97;
		    marks[0][2] = 80;
		// Allocating memory for marks obtained in three subjects by student Alice.
		    marks[1][0] = 99;
		    marks[1][1] = 98;
		    marks[1][2] = 100;
		// Allocating memory for marks obtained in three subjects by student Bob.   
		    marks[2][0] = 87;
		    marks[2][1] = 99;
		    marks[2][2] = 93;
		    
		    for(int i = 0 ; i<marks.length;i++)
		    {
		    	
		    int totalmarks = 0;
		       for (int  j=0; j <marks.length;j++)
		    	{
		    		totalmarks= totalmarks+marks[i][j];
		    	}
		    	System.out.println("total marks obtained by " +str[i] +" "+ totalmarks );
		    	for(int k= 0 ; k<str.length;k++)
		    	{
		    		//System.out.println("total marks obtained by " + totalmarks );
		    		 float percentage = totalmarks/3;
		    		System.out.println("percentage obtainted by " +str[i] +" "+ percentage);
		    	}
		    	
		    		
		    }

	}
}

