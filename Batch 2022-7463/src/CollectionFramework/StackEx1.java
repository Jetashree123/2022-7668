package CollectionFramework;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;


public class StackEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		
	//st.push(86);
	//st.push(34);
		
		if(st.empty())
		{
			System.out.println("Please enter the elements : ");
			for(int i = 0 ; i< 10;i++)
			{
				st.push(sc.nextInt());
			}
		}
		else
		{
			System.out.println("Stack contains:" +st.size()+"Elements");
		}
		
		Iterator<Integer> itr = st.iterator();
		System.out.println("Elements present in the stack: ");
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("please enter element to search : ");
		int searchkey = sc.nextInt();
		
		if(st.contains(searchkey))
		{
			System.out.println("present at " +st.search(searchkey) + " Position");
		}
		}
		
	}


