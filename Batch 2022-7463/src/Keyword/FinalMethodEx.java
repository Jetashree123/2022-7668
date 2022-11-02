package Keyword;

public class FinalMethodEx {
	
	final int x = 10;
	
	FinalMethodEx()
	{
		System.out.println("This is an default constructor");
	}

	final void display()
	{
		System.out.println("Value of x is :" +x);
	}
	
}
class FinalMethod2 extends FinalMethodEx
{
	
	
	void display()
	{
		System.out.println("This is and overridden method");
	}

	
}
class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalMethod2 fm = new FinalMethod2();
		fm.display();
		
	}

}
