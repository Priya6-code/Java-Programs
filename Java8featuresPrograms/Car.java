package Java8featuresPrograms;

public class Car implements Vehicle{
	public void start() {
	System.out.println("Vehicle car started");
	}
	
	   @Override
	    public void m1() {
	        System.out.println("Overridden m1() method in Car class");
	    }
      
	public static void main(String[] args) {
		
		Car c=new Car();
		c.start();
		c.m1();
		Vehicle.stop();
	
	}
	

}
