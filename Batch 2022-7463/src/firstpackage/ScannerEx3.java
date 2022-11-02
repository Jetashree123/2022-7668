package firstpackage;

import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    
		    Scanner sc = new Scanner(System. in );
		    // Initialize sum and count of input elements 
		    int sum = 0,
		   count = 0;
		  /*  System.out.println("Enter range value to calculate mean");
		    int n= sc.nextInt();*/
		    //Checking if an int value is available 
		   		      // Read an int value 
		    System.out.println("Enter the numbers and any character other than an integer to get their mean:");
		  /* for(int i = 1 ; i<=n; i++)
			   {int num = sc.nextInt();
		      sum += num;
		      count++;
			   }
		    */
		    while(sc.hasNextInt())
		    {
		    	int num = sc.nextInt();
		    	sum+=num; //sum = sum+num;
		    	count++;
		    }
		    int mean = sum / count;
		    System.out.println("Mean of the numbers is: " + mean);
		  }

}
