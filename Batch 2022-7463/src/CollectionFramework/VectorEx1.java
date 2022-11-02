package CollectionFramework;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.*;

public class VectorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
		Vector<String> v = new Vector<String>(20); //initial capacity 10
		   System.out.println(v.capacity());
		System.out.println("Enter elements to the list : ");
				v.add("Abc");
		for(int i = 0 ; i<5 ; i++) {
		 v.add(sc.nextLine());//v.add(sc.nextLine());
		}
		
		for(int j = 0 ; j<v.size() ; j++) {
			System.out.println("List of the elements : " +v.get(j));
			}
					 
		List<String> v2 = new Vector<String>(v);
		v2.add("Guru");
		v2.add("Pavan");
		Iterator<String> itr = v2.iterator();
		System.out.println("Merged elements from both the list : ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		
		
	}

}
