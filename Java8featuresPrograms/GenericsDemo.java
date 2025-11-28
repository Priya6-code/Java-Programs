package Java8featuresPrograms;

public class GenericsDemo<T> {
	  public void m1(T arg) {
		  System.out.println("Param received " + arg);
	  }
	

	public static void main(String[] args) {
 
		GenericsDemo d=new GenericsDemo();
		d.m1(10);
		d.m1("Priya");
		d.m1(20.05);
		d.m1('c');
		d.m1(true);
       

	}

}
