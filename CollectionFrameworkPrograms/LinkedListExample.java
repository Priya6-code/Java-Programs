package CollectionFrameworkPrograms;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l=new LinkedList();
		l.add("Priya");
		l.add("Hyd");
		l.add("Ram");
		System.out.println("elem are"+l);
		l.removeFirst();
		System.out.println("first ele is"+l);
		l.removeLast();
		System.out.println("last elem is"+l);
		l.set(0,"Anil");
		System.out.println("elem"+l);
	}

}
