package CollectionFrameworkPrograms;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		lhm.put(1,"Ram");
		lhm.put(2,"Ravi");
		lhm.put(3,"Priya");
		System.out.println("The elements in linked hashmap are :"+lhm);
		
		Set<Integer> keys=lhm.keySet();
		System.out.println("Keys are:"+keys);
		
		Collection<String> val=lhm.values();
		System.out.println("Values are"+val);
		
		Set<?> entry=lhm.entrySet();
		System.out.println("Keys and values are"+entry);
		
		
	
		
 
	}

}
