package CollectionSetPrograms;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

       TreeSet<Integer> ts=new TreeSet<>();
       
       ts.add(20);
       ts.add(10);
       ts.add(5);
       ts.add(90);
       ts.add(100);
       
       System.out.println(ts);
       System.out.println(ts.first());
       System.out.println(ts.last());
       System.out.println(ts.higher(50));
       System.out.println(ts.lower(90));
       System.out.println(ts.pollLast());
       System.out.println(ts.pollFirst());
       
       System.out.println(ts.ceiling(25));
       System.out.println(ts.floor(80));
	}

}
