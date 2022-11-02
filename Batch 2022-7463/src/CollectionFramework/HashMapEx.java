package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<K,V> m=new HashMap<>();
		Map<Integer,String> student = new HashMap<>();
		student.put(101,"Dinakar");
		student.put(102, "Dinesh");
		student.put(103, "Sanket");
		student.put(104, "pavansai");
		
		Map<String,Integer> Marks = new HashMap<>();
		Marks.put("Dinakar", 85);
		Marks.put("Dinesh", 70);
		Marks.put("Sanket", 80);
		Marks.put("Pavansai", 75);
		
		System.out.println("List of students : " +student);
		
		System.out.println("student Marks : " +Marks);
		System.out.println("List of roll nos : " +student.keySet());
		System.out.println("List of enroll students : " +student.values());
		System.out.println("Newly enroll students:  " +student.putIfAbsent(105, "Sameer"));
	    System.out.println("List of students : " +student);
	
	
		
	}

}
