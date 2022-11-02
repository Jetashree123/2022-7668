package Keyword;

public class StaticVariableEx1 {
	
	static int counter;
	
	StaticVariableEx1()
	{
		counter++;
		System.out.println("Current value of the counter is : " +counter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariableEx1 s1 = new StaticVariableEx1();
		//s1.counter = 10;
		StaticVariableEx1 s2 = new StaticVariableEx1();
		StaticVariableEx1 s3 = new StaticVariableEx1();
	}

}
