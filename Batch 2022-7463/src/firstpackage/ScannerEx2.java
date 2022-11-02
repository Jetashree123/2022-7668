package firstpackage;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ed=new Scanner(System.in);
		int[] a=new int[5];
		int i;
		System.out.println("Please Enter An Array");
		for(i=0;i<5;i++)
		{
		a[i]=ed.nextInt();
		}
		System.out.println("Entered Array:-");
		for(i=0;i<5;i++)
		{
		System.out.println(a[i]);
		}
	}

}
