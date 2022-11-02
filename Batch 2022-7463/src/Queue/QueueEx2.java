package Queue;
		import java.util.Comparator;
		import java.util.PriorityQueue;

		public class QueueEx2 {
		    public static void main(String[] args) {
		        Comparator<String> stringLengthComparator = new Comparator<String>() {
		            @Override
		            public int compare(String s1, String s2) 
		            {
		                return s1.length() - s2.length();
		            }
		        };
		        /*
		        The above Comparator can also be created using lambda expression like this =>
		        Comparator<String> stringLengthComparator = (s1, s2) -> {
		            return s1.length() - s2.length();
		        };
		        The above statement can be shortened even further like this =>
		        Comparator<String> stringLengthComparator = Comparator.comparingInt(String::length);
		        */
		        // Create a Priority Queue with a custom Comparator
		        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(stringLengthComparator);

		        // Add items to a Priority Queue (ENQUEUE)
		        namePriorityQueue.add("Lisa");
		        namePriorityQueue.add("Robert");
		        namePriorityQueue.add("John");
		        namePriorityQueue.add("Chris");
		        namePriorityQueue.add("Angelina");
		        namePriorityQueue.add("Joe");
		        namePriorityQueue.add("AB");
		        namePriorityQueue.add("Jetashree");
		        // Remove items from the Priority Queue (DEQUEUE)
		        while (!namePriorityQueue.isEmpty())  //!false   = true
		        
		        {
		            System.out.println(namePriorityQueue.remove());
		        }
	}
}
