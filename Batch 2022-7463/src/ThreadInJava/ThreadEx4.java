package ThreadInJava;



class MultiThreadEx extends Thread{
		
	public void run() {
		System.out.println("Reference of currently running thread     " + Thread.currentThread().getId());
		
	}
}

public class ThreadEx4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main THread is running !!!");

		for(int i = 0; i<8;i++)
		{
			MultiThreadEx mt = new MultiThreadEx();
			mt.start();
		}
	}

}
