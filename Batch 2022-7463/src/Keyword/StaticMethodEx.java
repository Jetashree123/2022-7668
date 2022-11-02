package Keyword;

public class StaticMethodEx {
	static int a = 10;
	int b = 20;
	
	//
	public void display()
	{
		System.out.println("Static variable : " + a);
		
		System.out.println("Non static variable :" +b);
	}
	
	public static void printData()
	{
		System.out.println("Static variable : " + a);
		
		//System.out.println("Non static variable :" +b);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticMethodEx st = new StaticMethodEx();
		st.display();
		
		StaticMethodEx s = null;
		s.printData();
	    int num = st.a;
	    System.out.println(num);

	}

}
