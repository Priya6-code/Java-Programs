package ExceptionHandling;

public class ExceptionDemo1 {

   static void anyMethod() {
    try {
    	System.out.println("Priya");
    }
     catch(Exception e){
    	 System.out.println("Name");
     }
    finally {

          return;
    }
    //System.out.println("-----");
	
	}
	public static void main(String[] args) {
        anyMethod();

}
}