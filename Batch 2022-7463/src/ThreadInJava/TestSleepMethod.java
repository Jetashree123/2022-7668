package ThreadInJava;

class TestSleepMethod extends Thread
{  
 public void run()
{  
  for(int i=1;i<5;i++)
{  
   try{ 
	   Thread.sleep(1000);  //0.5 second
	   } 
   catch(InterruptedException e)
   {
	   System.out.println(e);
	} 
    System.out.println(i);  
  }  
 }  
 public static void main(String args[])
{  
	 
 System.out.println("Main thread is running");
  TestSleepMethod t1=new TestSleepMethod();  
  TestSleepMethod t2=new TestSleepMethod();  
   
  
  t1.start();  
  t2.start();
  //t1.run();  
 // t2.run();  
 }  
} 


