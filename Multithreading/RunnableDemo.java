package Multithreading;

public class RunnableDemo implements Runnable {
	
	public void run() {
		System.out.println("Run method called");
	}

	public static void main(String[] args) {
		
		RunnableDemo r= new RunnableDemo ();
		Thread t=new Thread(r);
		t.start();

	}

}
