package ThreadInJava;

public class TestJoinMethod extends Thread{
public void run()
{
	System.out.println("Thread 1 is running");
	
	try
	{
		Thread.sleep(500);
	}
	catch(InterruptedException e)
	{
		System.out.println(e);
		System.out.println("Thread 2 is interrupted");
	}
}
	
	public static void main(String args[]) {
		
		System.out.println("Main thread is running");
		TestJoinMethod t1 = new TestJoinMethod(); //new thread is born
		TestJoinMethod t2 = new TestJoinMethod(); //new thread is born
		if(t1.isAlive())
		{
			//t1.start();
			System.out.println("Thread is not alive or strated!!");
		}
		else
		{
		System.out.println(t1.isAlive());
		t1.start();
		}
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		t2.start();
		System.out.println(t2.isAlive());
	
	}
	
}
