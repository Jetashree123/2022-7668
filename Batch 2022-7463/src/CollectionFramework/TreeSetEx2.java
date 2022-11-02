package CollectionFramework;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
public class TreeSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        // Creating a TreeSet with a custom Comparator (Descending  Order)
		        SortedSet<String> fruits = new TreeSet<>(Comparator.reverseOrder());

		        /*
		            The above TreeSet with the custom Comparator is the concise form of the following:
		            SortedSet<String> fruits = new TreeSet<>(new Comparator<String>() {
		                @Override
		                public int compare(String s1, String s2) {
		                    return s2.compareTo(s1);
		                }
		            });
		        */

		        // Adding new elements to a TreeSet
		        fruits.add("Banana");
		        fruits.add("Apple");
		        fruits.add("Pineapple");
		        fruits.add("Orange");
		        System.out.println(fruits.comparator());
		      // System.out.println( fruits.comparator());

		        System.out.println("Fruits Set : " + fruits);
	}

}
