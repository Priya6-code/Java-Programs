package CollectionFrameworkPrograms;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExampleDemo {

	public static void main(String[] args) {
		
		Vector<String> v=new Vector<String>();
		v.add("Priya");
		v.add("Srinivas");
		v.add("Ram");
		v.add("deepu");
		v.add("Priya");
		System.out.println("THe vector elem"+v);
		
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
