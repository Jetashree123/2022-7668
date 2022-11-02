package CollectionFramework;
import java.util.*;


public class HashSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List <Integer> al = new ArrayList<Integer>();
		
		al.add(5);
		al.add(10);
		al.add(5);
		al.add(20);
		al.add(5);
		al.add(20);
		al.add(15);
		al.add(45);	
		al.add(25);
		al.add(10);
		//al.add(null);
		System.out.println(al);
		
		Set<Integer> s= new TreeSet<Integer>(al);  //collection c;
		
		Iterator<Integer> itr = s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println("elements of the set : " + itr.next());
		}
		
	}

}
