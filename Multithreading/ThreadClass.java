package Multithreading;

public class ThreadClass extends Thread{
	
		public void run() {
			System.out.println("Run method called");
		}
		
		public static void main(String[] args) {
			ThreadClass tc=new ThreadClass();
			Thread t=new Thread(tc);
			t.start();
				

	}

		
}
