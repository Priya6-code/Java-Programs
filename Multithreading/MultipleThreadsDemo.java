package Multithreading;

public class MultipleThreadsDemo implements Runnable{

	public void run() {
		System.out.println("run() method called"+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("run() method ended");
	}
	public static void main(String[] args) {
		
		MultipleThreadsDemo md=new MultipleThreadsDemo();
		Thread t1=new Thread(md);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setName("Thread-1");
		
		Thread t2=new Thread(md);
		t2.setPriority(Thread.NORM_PRIORITY);
		t2.setName("Thread-2");
		
		Thread t3=new Thread(md);
		t3.setPriority(Thread.MIN_PRIORITY);
		t3.setName("Thread-3");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
