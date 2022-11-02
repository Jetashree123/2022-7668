package ThreadInJava;

class Priority extends Thread 
{
	public void run () {
		try {
			Thread.sleep(500);
			System.out.println("Name of the running thread is" + Thread.currentThread().getName());
			System.out.println("Priority of the currently running thread : " + Thread.currentThread().getPriority());
		}
		catch(InterruptedException ie)
		{
		}
		
	}
}
public class TestPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Priority t1 = new Priority(); //new thread is created	
		Priority t2 = new Priority();	//new thread is created
		t1.setPriority(Thread.MAX_PRIORITY); //setting Maximum priority to thread 1
		t2.setPriority(Thread.MIN_PRIORITY); //setting minimum priority to thread 2
		t1.start();
		t1.setName("HighestPriorityThread");
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException ie)
		{
		}
		t2.start();
		t2.setName("LowestPriorityThread");
	}

}
