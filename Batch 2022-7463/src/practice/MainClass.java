package practice;
import java.util.ArrayList;
import java.util.Scanner;
 
class ArrayListex1 {
 
	ArrayList<Integer> list;
	Scanner scan;
	
	int n;
	
	void getVal() {
		
		list =  new ArrayList<Integer>();
		scan = new Scanner(System.in);
		
		System.out.println("Insert Elements");
		
		System.out.println("\nEnter 'n' value :");
		//n = Integer.parseInt(scan.nextLine());
		n=scan.nextInt();
		
		System.out.println("Enter the data :");
		
		for(int i=0; i<n; i++) {
			
			list.add(scan.nextInt());
		}		
	}
	
	void display() {
		
		System.out.println("\nThe ArrayList");
		
		if(list.isEmpty()) {
			
			System.out.println("ArrayList is Empty..");
		}		
		else {
			
			for(int i=0; i<list.size(); i++) {
				
				System.out.println(list.get(i));
			}
		}
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		ArrayListex1 obj = new ArrayListex1();
		
		obj.getVal();
		obj.display();
	}
}
