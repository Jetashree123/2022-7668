package ThreadInJava;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Thread t = Thread.currentThread();
      System.out.println(t);
      System.out.println("Name of the currently running thread is : "+t.getName());

//try to change name of the main thread

t.setName("New thread");

System.out.println(t);
System.out.println("currently running thread is : "+t.getName());
	}

}
