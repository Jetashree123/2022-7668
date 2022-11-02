package CollectionFramework;
import java.util.*;


public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> al = new ArrayList<Integer>();   // empty arraylist object  created//initial capacity is 10
 Scanner sc = new Scanner(System.in);
 int i,j;
 
 if(al.isEmpty())
 { 
	 
 System.out.println("Specify element size :  ");
 int size = sc.nextInt();
 System.out.println("Please enter elements : ");
		for( i = 0 ; i<size; i++)
		{
			al.add(sc.nextInt());	
		}	
		System.out.println(al);
	}
	else
	{
		System.out.println("NO of elements " +al.size());
	}

 List<Integer> al2 = new ArrayList<Integer>();
 
 System.out.println("Specify element size :  ");
 int size1 = sc.nextInt();
 System.out.println("Please enter elements : ");
		for( j = 0 ; j<size1; j++)
		{
			al2.add(sc.nextInt());	
		}	
		System.out.println(al2);
		boolean success = al.addAll(al2);
	System.out.println("Combined element of list1 and list 2 : " +al);
	al2.clear();
	System.out.println("After deleting elements : " +al2);
	al.remove(1);
	System.out.println("After removing one elements from list 1 : " +al);
	al.removeAll(al);
	System.out.println("After removing all elements from list 1 : " +al);
}
}

