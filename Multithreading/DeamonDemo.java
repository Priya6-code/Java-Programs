package Multithreading;

public class DeamonDemo implements Runnable{
	public void run() {
	
		if(Thread.currentThread().isDaemon()) {
		System.out.println("deamon thread called");
		}else {
			System.out.println("normal method executed");
		}
	}

	public static void main(String[] args) {
		DeamonDemo d=new DeamonDemo();
		Thread t=new Thread(d);
		t.setDaemon(true);
		t.start();
		try {
	        Thread.sleep(100);  
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }

	}

}
