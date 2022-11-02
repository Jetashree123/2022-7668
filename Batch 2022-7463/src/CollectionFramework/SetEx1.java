package CollectionFramework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> batch1= new HashSet<String>();
		Set<String> batch2= new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		if(batch1.isEmpty())
		{
			System.out.println("Set is empty");
			System.out.println("Specify size of the set");
			int size = sc.nextInt();
			System.out.println("insert the elements to the set 1");
			sc.nextLine();
			for(int  i = 0; i<size;i++)
			{
		batch1.add(sc.nextLine());
			}
			System.out.println(batch1);
		}
		else
		{
			System.out.println("Set1 has " +batch1.size()+"elements");
		}
		
	
	batch2.add("John");
	batch2.add("Neji");
	batch2.add("Sam");
	batch2.add("Todo");
	System.out.println(batch2.addAll(batch1)); //
	System.out.println(batch2);
	System.out.println(batch2.containsAll(batch1));
	System.out.println(batch2.retainAll(batch1));
	System.out.println(batch2.removeAll(batch1));
	System.out.println(batch1);
	System.out.println(batch2);
	
	}

}
