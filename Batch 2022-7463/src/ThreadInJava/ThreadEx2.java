package ThreadInJava;

  //new thread
			public class ThreadEx2 extends Thread {
			public 	void run()
			{
			 Thread th1 = Thread.currentThread();
			 System.out.println(th1); 
			  System.out.println("New thread strats running");
			  System.out.println("I am in run() method");
			}
			public static void main(String[] args)
			{
			 System.out.println("Main thread starts running");	
			 Thread ct1 = Thread.currentThread();
			 System.out.println(ct1);
			 
			  int ac1 = Thread.activeCount();
			  System.out.println(ac1);  
			 
			// Create an object of NewThread class.
			  ThreadEx2 nt = new ThreadEx2(); //new thread
			   int ac2 = Thread.activeCount();
			   System.out.println(ac2);
			 
			// Create an object of Thread class and pass the object reference variable nt.
			   Thread t = new Thread(nt);
			   int ac3 = Thread.activeCount();
			   System.out.println(ac3);
			 
			// Now run thread on the object. For this, call start() method using reference variable t.
			   t.start(); // This thread will execute statements inside run() method of NewThread object.
			   int ac4 = Thread.activeCount();
			   System.out.println(ac4);
			   t.setName("NewThread"); // Setting a new name of thread.
			 }
	}

