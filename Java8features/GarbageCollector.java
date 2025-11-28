package Java8features;

public class GarbageCollector {

	public static void main(String[] args) {
		
		GarbageCollector c=new GarbageCollector();
		c=null;
		System.gc();
		
		

	}
	
	protected void finalize() throws Exception{
		System.out.println("finalize method called");
		
	}

}
