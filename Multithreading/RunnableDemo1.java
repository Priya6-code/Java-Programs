package Multithreading;

public class RunnableDemo1 implements Runnable{
	
	public void run() {
		System.out.println("run method called");
		
		Thread tr=Thread.currentThread();
		System.out.println(tr.getName());
		
		System.out.println("run method ended");
	}

	public static void main(String[] args) {
		
		RunnableDemo1 r=new RunnableDemo1();
		Thread  t=new Thread(r);
		//t.start();
		t.run();

	}

}
