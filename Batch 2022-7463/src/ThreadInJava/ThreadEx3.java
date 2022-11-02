package ThreadInJava;

public class ThreadEx3 implements Runnable {

		 public void run()
		 {
		  System.out.println("New thread running ");
		  for(int i = 1; i <= 5; i++)
		  {
		   System.out.println(i);  
		  }
		 System.out.println(Thread.currentThread());
		}
		public static void main(String[] args)
		{
		 System.out.println("Main thread running");	 
		 
		// Create an object of MyThread class.	 
		 ThreadEx3 th = new ThreadEx3();
		 
		// Create an object of Thread class and pass reference variable th to Thread class constructor.   
		   Thread t = new Thread(th);
		   
		   t.start(); // This thread will execute statements inside run() method of MyThread object.
		   System.out.println("Name of the new born thread:" +t.getName());
		t.setName("thread1");
		
		}
		
		
		
		
}
