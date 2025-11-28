package Multithreading;

public class ThreadSleep implements Runnable{
	
	public void run() {
		System.out.println("run method started");
		try {
			Thread.sleep(5000);//blocked state
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	    System.out.println("run method ended");
	}

	public static void main(String[] args) {

		ThreadSleep ts=new ThreadSleep();//new state
		Thread t=new Thread(ts);
		t.start();

	}

}
