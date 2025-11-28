package CollectionFrameworkPrograms;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

	public static void main(String[] args) {
		
	SortedMap<Integer,String> smp=new TreeMap<Integer,String>();
	smp.put(1,"Priya");
	smp.put(2,"Anil");
	smp.put(3,"Ram");
	System.out.println("Sorted map elements are"+smp);
	
	System.out.println("the first key is "+smp.firstKey());
	
	System.out.println("the last key is "+smp.lastKey());
	
	
	/*int x=2;
	int y=++x;
	System.out.println(""+y);
	System.out.println(""+x);*/
	
	
	
}
}
