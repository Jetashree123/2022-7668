package CollectionFramework;
import java.util.LinkedList;

public class LinkedListEx2 {

		public static void main(String[] args) 
		{ 
		// Create a LinkedList object. 
		   LinkedList<Integer> even = new LinkedList<Integer>(); 
		   LinkedList<Integer> odd = new LinkedList<Integer>(); 
		// Adding even numbers from 0 to 20 as elements in the list. 
		   for(int i = 0 ; i <= 20; i++)
		   { 
		    if(i!=0 && i % 2 == 0)
		    {// It will check even number. 
		       even.add(i); 
		    }
		    else
		    {
		    	odd.add(i);
		    }
		   } 
		   System.out.println(even);
		   System.out.println(odd);
		   
		// Call getFirst() method to get first even number. 
		   Object firstEvenNumber = even.getFirst(); // Return type of getFirst() methods is an Object. 
		   System.out.println("First even number: " +firstEvenNumber); 

		  Object lastEvenNumber = even.getLast(); 
		  System.out.println("Last even number: " +lastEvenNumber); 
		  Object getElement = even.get(5); 
		  System.out.println("Even number at index 5: " +getElement); 
	}

}
