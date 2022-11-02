package ThreadInJava;
import java.util.Scanner;

		class Details implements Runnable
		{
			static String name;
		
			public void run()
			{
			Scanner s=new Scanner(System.in);
			System.out.println("enter user name");
			name=s.next();
			System.out.println("hi, welcome "+ name);
			System.out.println("Name of the currently running thread : " +Thread.currentThread());
			
			}
		}

		class Printing extends Details implements Runnable
		{
			public void run()
			{
				System.out.println("user name is" +Details.name);
				System.out.println("Name of the currently running thread : " +Thread.currentThread());
			}
		}
		public class MultiThreadEx5 {

			public static void main(String[] args) 
			{
				Runnable r1=new Details();
				Runnable r2=new Printing();
				
				Thread t1=new Thread(r1);//new state of thread
				Thread t2=new Thread(r2);//new state of thread
				
				t1.start(); //Runnable state for t1(thread 1)
				try {
					Thread.sleep(20000);
					t2.start(); //Runnable state for t2(thread 2)
				}
				catch(Exception e)
				{
					}
				

			}
	}
		

