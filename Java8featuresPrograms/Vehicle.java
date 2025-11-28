package Java8featuresPrograms;

public interface Vehicle {
	
	public void start();
	public default void m1() {
		
		System.out.println("m1() method called");
		
	}
	public default void m2() {
		
	}
	
	public static void stop() {
		System.out.println("stop the vehicle");
	}

}
