package secondpackage;

import firstpackage.Demo1;

class Demo2 extends Demo1
{
	
	public void dis()
	{
		System.out.println("inherited class");
	}
	
	public static void main(String args[])
	{
		Demo2 as= new Demo2();
		as.dis();
		System.out.println(as.sum());
		
	}

}
