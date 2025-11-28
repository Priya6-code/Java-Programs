package Multithreading;

public class DeadlockUsingJoin {

	public static void main(String[] args) {
		
		Thread t=new Thread() {
			public void run() {
				for(int i=0;i<=5;i++) {
					System.out.println(Thread.currentThread().getName()+"=>"+i);
				}
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t.setName("Thread-1");

		
		Thread t1=new Thread() {
			public void run() {
				
				for(int i=0;i<=5;i++) {
					System.out.println(Thread.currentThread().getName()+"=>"+i);
				}
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		t1.setName("Thread-2");
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
		
		
	}

}
