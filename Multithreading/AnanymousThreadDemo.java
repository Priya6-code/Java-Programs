package Multithreading;
import java.util.concurrent.Callable;
public class AnanymousThreadDemo {

	public static void main(String[] args) {
		
		Thread t1=new Thread();
		{
			public void run() {
				System.out.println("run() method 1 called");
			}
		};
		t1.start();
		Runnable r=new Runnable() {	
			@Override
			public void run() {	
				System.out.println("run() method 2 called");
			}
		};
		
		Thread t2=new Thread(r);
		t2.start();
		Callable c=new Callable() {
			public Object call() throws exception{
				System.out.println("call() method logic3");
			}
		}
		

	}

}
