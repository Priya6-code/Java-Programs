package CollectionFrameworkPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Priya");
		al.add("iya");
		al.add("riya");
		al.add("ya");
		
		Iterator<String> i=al.iterator();
		while(i.hasNext()) {
			String next=i.next();
			System.out.println(next);
		}

	}

}
