package Multithreading;

public class DeadlockCondition {

	public static void main(String[] args) {
		
		String s="HI";
		String s1="Hello";
		
		Thread t1=new Thread() {
			public void run() {
				synchronized(s) {
					System.out.println("Thread1 locked for resource1");
					
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
						
					}
					synchronized(s1) {
					System.out.println("Thread 1 waiting for resource 2");
				}		
			}
		}
		};
		Thread t2=new Thread() {
			public void run() {
			synchronized(s1) {
                System.out.println("Thread2 locked for resource2");
				
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e){
					e.printStackTrace();
					
				}
				synchronized(s) {
				System.out.println("Thread 2 waiting for resource 1");
			}
		}
		}
		};
		t1.start();
		
		t2.start();
	
		
		
	}		

}


