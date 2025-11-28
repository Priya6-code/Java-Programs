package Multithreading;

public  class SynchronizedDemo implements Runnable {
	
	public synchronized void printNums() {
		
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+"=>"+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
		@Override
		public void run() {
			printNums();
		}
		
	public static void main(String[] args) {
		SynchronizedDemo sd=new SynchronizedDemo();
		Thread t=new Thread(sd);
		t.setName("Thread-1");
		
		Thread t1=new Thread(sd);
		t1.setName("Thread-2");
		
		t.start();
		 t1.start();
	        
		
	}

}
