package CollectionFramework;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {

		// Create two ArrayLists
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		// Prompt the user to enter two lists
		// each with size of arrayList integers
	
		System.out.println("list 1 elements: ");
		fill(list1);//static method 
		System.out.println("list 2 elements:: ");
		fill(list2);

		// Combined lists
		ArrayList<Integer> list3 = union(list1, list2); //static method

		// Display combined list
		System.out.print("The combined list is: ");
		for (int i = 0; i < list3.size(); i++) {
			System.out.print(list3.get(i) + " ");
		}
		System.out.println();
	}

	/** Returns the union of two array lists of integers */
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) 
	{
		ArrayList<Integer> list3 = list1;
		for (int i = 0; i < list2.size(); i++) {
			list3.add(list2.get(i));
		}
		return list3;
	}	

	
	/** Adds user input to a list */
	public static void fill(ArrayList<Integer> list) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Specify size of the list :");
		int arraysize = input.nextInt();
		System.out.println("Enter the elements for the list");
		for (int i = 0; i < arraysize; i++) {
			list.add(input.nextInt()); //list.add(element);
	}
	}
}
