package CollectionFramework;

import java.util.*;
import java.util.List;

public class ListInterfaceEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

      List <String>al = new ArrayList<String>();	
      //ArrayList al = new ArrayList();
      //ArrayList <String>al1 = new ArrayList<String>();
      al.add("1");//0
      al.add("2");//1
      al.add("3");//2
      al.add("4");//3
      al.add("5");//4
      al.add(5,"6");//5
      al.add(6,"7");//6
      al.add("8");//7
      System.out.println("Elements present in arrayList : " +al);
      
      if(al.isEmpty())//false
      {
    	  
      }
      
     
      /*
      for(String element : al)
      {
    	  System.out.println("elements present in arraylist:  " +element);
      }
      */
      
     /* Iterator <String>itr = al.iterator();
      
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
      }*/
      //7 times loop will be iterated
      for(int  i = 0; i<al.size();i++)
      {
    	  System.out.println(al.get(i));
      }
            
      }
      
	}


