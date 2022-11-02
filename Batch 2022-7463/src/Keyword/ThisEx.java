package Keyword;

public class ThisEx {
	
	void msg()
	{
		System.out.println(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisEx th = new ThisEx();
System.out.println(th);
th.msg();
	}

}
