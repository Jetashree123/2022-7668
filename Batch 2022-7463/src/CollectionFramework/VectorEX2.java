package CollectionFramework;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorEX2 {
	 
	       public static void main(String args[]) { 
	    	   
	    	  System.out.println("Wecome to EduBridge");
	    	   Scanner sc= new Scanner (System.in);
	    Vector<String> vec = new Vector<String>();  
	        vec.add("Madhan");  
	          vec.add("Mani");  
	          vec.add("Ravi");  
	          vec.add("Arun");  
	          
	          System.out.println("Totoal number of old student present now: "+vec.size());  
	          System.out.println("Class Strength : "+vec.capacity());  
	          
	 System.out.println("Student present right now: "+vec);
	 
	 System.out.println(" Please Enter the New joiners name");
	 
	for(int i=vec.size(); i<10; i++ ) {
		 //sc.next();
		 vec.add(sc.nextLine());
	 }

	 
	 Iterator<String> itr= vec.iterator();
			  
			  while(itr.hasNext()){
				System.out.println(itr.next());
			  }
			  
			  System.out.println("Class student after new joiners: "+vec.size());  
			          System.out.println("Total student number after new  joiners: "+vec.capacity());  
			        System.out.println("Total student right now: "+vec);  
			        System.out.println("While taking attendence:");
			        System.out.println("Teacher: It's that mani is present today?");
			        
			     if(vec.contains("Mani"))  
			            {  
			               System.out.println("Yes, He is present" +vec.indexOf("Mani"));  
			            }  
			            else  
			            {  
			               System.out.println("No, He is not");  
			 }  
			 System.out.println("The first student name of the list is = "+vec.firstElement());   
			 System.out.println("The last student name of the list is = "+vec.lastElement());  
			 System.out.println("The last student name of the list is = "+vec.hashCode());
			       }  
			}  
