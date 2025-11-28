package CollectionFrameworkPrograms;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		/*HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Priya");
		hm.put(2,"Anil");
		hm.put(3,"Ram");
		System.out.println("The elements in hashmap are :"+hm);
		System.out.println(hm.size());
		System.out.println(hm.containsKey(12));
		Set<Integer> keys=hm.keySet();
		System.out.println("Keys in the Hashmap are :"+keys);
		Collection<String> val=hm.values();
		System.out.println("Values in the map are :"+val);
		Set<?> entry=hm.entrySet();
		System.out.println("keys and values in the map"+entry);
		
		
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		Integer i1=new Integer(10); 
		Integer i2=new Integer(10); 
		hm1.put(i1,"John");
		hm1.put(i2,"Smith");
		System.out.println(hm1);  */
		
		
		HashMap<Integer,String> hm = new HashMap<>();

		hm.put(101,"ash"); 
		hm.put(101,"Integer");
		System.out.println(hm);
		
		ArrayList al=new ArrayList<>();	
		al.add("Priya");
		al.add("Priya");
		System.out.println(al);
		
		

	}
}
