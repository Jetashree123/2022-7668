package practice;
import java.util.*;
class Ex2{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
ArrayList <Integer> al2 = new ArrayList<Integer>(2);
System.out.println("enter the item in list");
while(sc.hasNextInt())
{
al2.add(sc.nextInt());
}
Iterator it1 = al2.iterator();
     while(it1.hasNext())
{
 System.out.println(it1.next());
}
}
}