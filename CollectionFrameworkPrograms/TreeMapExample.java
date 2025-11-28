package CollectionFrameworkPrograms;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(1,"Priya");
		tm.put(2,"Anil");
		tm.put(3,"Raju");
		System.out.println("The tree elements are:"+tm);
		System.out.println("The size "+tm.size());
		System.out.println("The first key is :"+tm.firstKey());
		System.out.println("The last element is"+tm.lastKey());
		System.out.println("The head elements are :"+tm.headMap(2));
		System.out.println("The tail elements are :"+tm.tailMap(3));
		Set<?> entry=tm.entrySet();
        System.out.println("The elements are:"+entry);
        System.out.println(" removed element"+tm.remove(2));
        System.out.println("Required key is  :"+tm.get(1));
	}

}
