package CollectionFrameworkPrograms;

import java.util.ArrayList;
import java.util.ListIterator;


public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Priya");
		al.add("iya");
		al.add("riya");
		al.add("ya");
		
		ListIterator<String> i=al.listIterator();
		while(i.hasNext()) {
			String next=i.next();
			System.out.println(next);
			
			if(next.equals("Priya")) {
				i.add("Melam");
				System.out.println(" After Removing Priya"+al);
			}
			
			if(next.equals("iya")) {
				i.set("Ram");
				System.out.println("replacing iya with"+al);
			}
			
			if(next.equals("ya")) {
				i.remove();
				System.out.println("removed"+al);
			}
		}


	}

}
